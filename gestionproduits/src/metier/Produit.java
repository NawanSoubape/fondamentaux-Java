package produitModel;

public class Produit {
	private int idproduct;
	private String name;
	private Categorie categorie;
	
	public Produit(int idproduct, String name, Categorie categorie) {
		super();
		this.idproduct = idproduct;
		this.name = name;
		this.categorie = categorie;
	}

	public Produit(int idproduct, String name) {
		super();
		this.idproduct = idproduct;
		this.name = name;
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

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Idproduct : " + idproduct + "\n Name=" + name + "\n Categorie=" + categorie;
	}
	
	

}
