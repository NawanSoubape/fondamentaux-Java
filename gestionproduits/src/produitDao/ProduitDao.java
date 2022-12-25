package produitDao;

import java.util.List;

import produitModel.Produit;

public interface ProduitDao {
	
	   public List<Produit> getAllProducts();
	   public Produit getProduct(int idProduit);
	   public void updateStudent(Produit produit);
	   public void deleteStudent(Produit produit);
	

}
