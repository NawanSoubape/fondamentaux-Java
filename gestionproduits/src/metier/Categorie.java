package produitModel;

import java.util.List;

public class Categorie {
	private int idcategorie;
	private String namecategorie;
	private List<Produit> products;
	
	
	public Categorie(int idcategorie, String namecategorie) {
		this.idcategorie = idcategorie;
		this.namecategorie = namecategorie;
	}
	
	
	public Categorie(int idcategorie, String namecategorie, List<Produit> products) {
		this.idcategorie = idcategorie;
		this.namecategorie = namecategorie;
		this.products = products;
	}


	public int getIdcategorie() {
		return idcategorie;
	}
	public void setIdcategorie(int idcategorie) {
		this.idcategorie = idcategorie;
	}
	public String getNamecategorie() {
		return namecategorie;
	}
	public void setNamecategorie(String namecategorie) {
		this.namecategorie = namecategorie;
	}


	public List<Produit> getProducts() {
		return products;
	}


	public void setProducts(List<Produit> products) {
		this.products = products;
	}


	@Override
	public String toString() {
		return "Idcategorie=" + idcategorie + "\n Namecategorie=" + namecategorie + "\n Products=" + products;
	}
	
	
	

}
