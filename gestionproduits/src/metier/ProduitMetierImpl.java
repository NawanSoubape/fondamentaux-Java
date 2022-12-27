package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.relation.Relation;

public class ProduitMetierImpl implements IMetier {
	
Connection con = SingletonConnexion.getConnection();
	@Override
	public void addCategorie(Categorie c) {

		try {
			String sql = "INSERT INTO categories(NOM_CATEGORIE) VALUES(?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, c.getNamecategorie());
			ps.executeUpdate();
			//System.out.println("2 "+con);
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addProduit(Produit p ,int idCat) {
		try {
			String sql = "INSERT INTO produits(NOM_PRODUIT,PRIX,QUANTITE,ID_CATEGORIE) VALUES(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, p.getName());
			ps.setDouble(2, p.getPrix());
			ps.setInt(3, p.getQuantite());
			ps.setInt(4, idCat);
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Produit> getProduitsParMC(String mc) {
		List<Produit> produits  = new ArrayList<>();
		try {
			String sql = "SELECT * FROM produits WHERE NOM_PRODUIT LIKE ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "%"+mc+"%");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Produit prod = new Produit();
				prod.setIdproduct(rs.getInt("ID_PRODUIT"));
				prod.setName(rs.getString("NOM_PRODUIT"));
				prod.setPrix(rs.getDouble("PRIX"));
				prod.setQuantite(rs.getInt("QUANTITE"));
				
				int idCat = rs.getInt("ID_CATEGORIE");
				PreparedStatement ps1 = con.prepareStatement("SELECT * FROM categories WHERE ID_CATEGORIE LIKE ?");
				ps1.setInt(1, idCat);
				ResultSet rs1 = ps1.executeQuery();
				rs1.next();
				Categorie cat = new Categorie();
				cat.setIdcategorie(rs1.getInt("ID_CATEGORIE"));
				cat.setNamecategorie(rs1.getString("NOM_CATEGORIE"));
				prod.setCategorie(cat);
				produits.add(prod);
				ps1.close();
			}
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return produits;
	}

	@Override
	public List<Produit> getProduitsParCat(int idCat) {
		List<Produit> produits  = new ArrayList<>();
		try {
			String sql = "SELECT * FROM produits WHERE ID_CATEGORIE = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, idCat);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Produit prod = new Produit();
				prod.setIdproduct(rs.getInt("ID_PRODUIT"));
				prod.setName(rs.getString("NOM_PRODUIT"));
				prod.setPrix(rs.getDouble("PRIX"));
				prod.setQuantite(rs.getInt("QUANTITE"));
				PreparedStatement ps1 = con.prepareStatement("SELECT * FROM categories WHERE ID_CATEGORIE = ?");
				ps1.setInt(1, idCat);
				ResultSet rs1 = ps1.executeQuery();
				rs1.next();
				Categorie cat = new Categorie();
				cat.setIdcategorie(rs1.getInt("ID_CATEGORIE"));
				cat.setNamecategorie(rs1.getString("NOM_CATEGORIE"));
				prod.setCategorie(cat);
				produits.add(prod);
				ps1.close();
			}
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return produits;
	}

	@Override
	public List<Categorie> getAllCategories() {
		List<Categorie> cats  = new ArrayList<>();
		try {
			String sql = "SELECT * FROM categories";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Categorie cat = new Categorie();
				cat.setIdcategorie(rs.getInt("ID_CATEGORIE"));
				cat.setNamecategorie(rs.getString("NOM_CATEGORIE"));
				cats.add(cat);
			}
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cats;
	}

	@Override
	public Categorie getCategorie(int idCat) {
		Categorie cat = null;
		try {
			String sql = "SELECT * FROM categories WHERE ID_CATEGORIE = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, idCat);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				cat = new Categorie();
				cat.setIdcategorie(rs.getInt("ID_CATEGORIE"));
				cat.setNamecategorie(rs.getString("NOM_CATEGORIE"));
				List<Produit> prods = this.getProduitsParCat(idCat);
				cat.setProducts(prods);
				
			}
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cat;
	}

}
