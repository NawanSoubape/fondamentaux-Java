package metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Categorie implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idcategorie;
	private String namecategorie;
	private List<Produit> products = new ArrayList<>();
	
	
	
	public Categorie() {
		
	}

	public Categorie(String namecategorie) {
		this.namecategorie = namecategorie;
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
