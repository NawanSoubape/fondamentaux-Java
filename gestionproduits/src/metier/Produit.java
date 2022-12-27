package metier;

import java.io.Serializable;

public class Produit implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idproduct;
	private String name;
	private double prix;
	private int quantite;
	private Categorie categorie;	
	
	
	public Produit() {

	}

	public Produit(String name, double prix, int quantite) {
		super();
		this.name = name;
		this.prix = prix;
		this.quantite = quantite;
	}

	
	public Produit(String name, double prix, int quantite, Categorie categorie) {
		super();
		this.name = name;
		this.prix = prix;
		this.quantite = quantite;
		this.categorie = categorie;
	}

	public int getIdproduct() {
		return idproduct;
	}

	public void setIdproduct(int idproduct) {
		this.idproduct = idproduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Idproduct : " + idproduct + "\n Name : " + name + "\n "
				+ "Prix : "+prix+"\n Quantite : "+quantite+"\n Categorie : " + categorie;
	}
	
	

}
