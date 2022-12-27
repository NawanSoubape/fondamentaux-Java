package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.entities.Produit;

public class ProduitDaoImpl implements IProduitDao{

	
	@Override
	public Produit save(Produit p) {
		Connection connection = SingletonConnection.getConnection();
		try {
			
			PreparedStatement ps = connection.prepareStatement("INSERT INTO produits(DESIGNATION,PRIX,QUANTITE) VALUES(?,?,?)");
			ps.setString(1, p.getDesignation());
			ps.setDouble(2, p.getPrix());
			ps.setInt(3, p.getQuantite());
			ps.executeUpdate();
			
			PreparedStatement ps1 = connection.prepareStatement("SELECT MAX(id) AS MAX_ID FROM produits");
			ResultSet rs = ps1.executeQuery();
			if(rs.next()) {
				p.setId(rs.getLong("MAX_ID"));
			}
			ps1.close();
			ps.close();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}

	@Override
	public List<Produit> produitsParMC(String mc) {
		Connection connection = SingletonConnection.getConnection();
		List<Produit> produits = new ArrayList<>();
		try {
			//System.out.println("0 "+connection);
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM produits WHERE DESIGNATION LIKE ?");
			ps.setString(1, mc);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Produit prod = new Produit();
				prod.setId(rs.getLong("ID"));
				prod.setDesignation(rs.getString("DESIGNATION"));
				prod.setPrix(rs.getDouble("PRIX"));
				prod.setQuantite(rs.getInt("QUANTITE"));
				produits.add(prod);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return produits;
	}

	@Override
	public Produit getProduitParId(Long id) {
		//Connection con = SingletonConnection.getConnection();
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit updateProdui(Produit p) {
		//Connection con = SingletonConnection.getConnection();
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduit(Long id) {
		//Connection con = SingletonConnection.getConnection();
		// TODO Auto-generated method stub
		
	}

}
