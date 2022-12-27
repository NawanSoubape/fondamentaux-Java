package metier;

import java.util.List;

public interface IMetier {
	
	public void addCategorie(Categorie c);
	public void addProduit(Produit p, int idCat);
	public List<Produit> getProduitsParMC(String mc);
	public List<Produit> getProduitsParCat(int idCat);
	public List<Categorie> getAllCategories();
	public Categorie getCategorie(int idCat);

}
