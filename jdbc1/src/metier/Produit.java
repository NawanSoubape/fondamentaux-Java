package metier;

import java.io.Serializable;

public class Produit implements Serializable {
	private int idProduit;
	private String nomProduit;
	private int quantite;
	
	
	public Produit() {
	
	}


	public Produit(String nomProduit, int quantite) {
		this.nomProduit = nomProduit;
		this.quantite = quantite;
	}


	public int getIdProduit() {
		return idProduit;
	}


	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}


	public String getNomProduit() {
		return nomProduit;
	}


	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
}
