package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.entities.Produit;

public class ProduitDaoImpl implements IProduitDao{
	
	Connection connection;
	
	@Override
	public Produit save(Produit p) {
		
		connection = SingletonConnection.getConnection();
		try {
			String sql = "INSERT INTO produits(DESIGNATION,PRIX,QUANTITE) VALUES(?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, p.getDesignation());
			ps.setDouble(2, p.getPrix());
			ps.setInt(3, p.getQuantite());
			ps.executeUpdate();
			
			PreparedStatement ps1 = connection.prepareStatement("SELECT MAX(id) AS MAX_ID FROM produits");
			ResultSet rs = ps1.executeQuery();
			if(rs.next()) {
				p.setId(rs.getLong("MAX_ID"));
			}
			//ps1.close();
			ps.close();
		} 
		catch (SQLException e) {
			System.out.println("Erreur from save produit : "+e);
		}
		
		return p;
	}

	@Override
	public List<Produit> produitsParMC(String mc) {
		connection = SingletonConnection.getConnection();
		List<Produit> produits = new ArrayList<>();
		try {
			String sql = "SELECT * FROM produits WHERE DESIGNATION LIKE ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, "%"+mc+"%");
			System.out.println("Mot cle saisi : "+mc);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Produit prod = new Produit();
				prod.setId(rs.getLong("ID"));
				prod.setDesignation(rs.getString("DESIGNATION"));
				prod.setPrix(rs.getDouble("PRIX"));
				prod.setQuantite(rs.getInt("QUANTITE"));
				produits.add(prod);
			}
			ps.close();
		} catch (SQLException e) {
			System.out.println("Erreur get produit by key word : "+e);
		}
		return produits;
	}

	@Override
	public Produit getProduitParId(Long id) {
		 connection = SingletonConnection.getConnection();
		Produit p = null;
		try {
			String sql = "SELECT * FROM produits WHERE ID = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1,id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				p= new Produit();
				p.setId(rs.getLong("ID"));
				p.setDesignation(rs.getString("DESIGNATION"));
				p.setPrix(rs.getDouble("PRIX"));
				p.setQuantite(rs.getInt("QUANTITE"));
			}
			ps.close();
		} catch (SQLException e) {
			System.out.println("Erreur get produit by id : "+e);
		}
		return p;
	}

	@Override
	public Produit updateProdui(Produit p) {
		connection = SingletonConnection.getConnection();
		try {
			String sql = "UPDATE produits SET DESIGNATION = ?,PRIX = ?,QUANTITE = ? WHERE ID = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, p.getDesignation());
			ps.setDouble(2, p.getPrix());
			ps.setInt(3, p.getQuantite());
			ps.setLong(4, p.getId());
			ps.executeUpdate();
			ps.close();
		} 
		catch (SQLException e) {
			System.out.println("Erreur from update produit : "+e);
		}
		
		return p;
	}

	@Override
	public void deleteProduit(Long id) {
		connection = SingletonConnection.getConnection();
		try {
			String sql = "DELETE FROM produits WHERE ID = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, id);
			ps.executeUpdate();
			ps.close();
		} 
		catch (SQLException e) {
			System.out.println("Erreur from delete produit : "+e);
		}
		
	}

}
