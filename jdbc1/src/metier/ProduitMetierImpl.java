package metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public class ProduitMetierImpl implements IProduitMetier{

	@Override
	public List<Produit> produitsParMC(String mc) {
		List<Produit> produits = new ArrayList<>();
		String sql = "SELECT * FROM produits WHERE nom LIKE ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_produits","root","");
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,"%"+mc+"%");
			ResultSet rs = ps.executeQuery();
		
			System.out.println();
			while(rs.next()) {
				Produit prod = new Produit();
				prod.setIdProduit(rs.getInt("id"));
				prod.setNomProduit(rs.getString("nom"));
				prod.setQuantite(rs.getInt("quantite"));
				produits.add(prod);
			}
			ps.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return produits;
	}

	@Override
	public void addProduit(Produit p) {
		String sql = "INSERT INTO produits(nom, quantite) VALUES (?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_produits","root","");
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, p.getNomProduit());
			ps.setInt(2, p.getQuantite());
			int nb = ps.executeUpdate();
			ps.close();
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
