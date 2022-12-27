package metier;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		ProduitMetierImpl prodImpl = new ProduitMetierImpl();
		//Ajout des catégries
//		prodImpl.addCategorie(new Categorie("Ordinateurs"));
//		prodImpl.addCategorie(new Categorie("Imprimantes"));
//		prodImpl.addCategorie(new Categorie("CD"));
		
		//Ajout des produits avec catégorie
//		prodImpl.addProduit(new Produit("Ordi PC",4000,50), 1);
//		prodImpl.addProduit(new Produit("Ordi Bureau",5000,40), 1);
//		prodImpl.addProduit(new Produit("Ordi MAC",8000,50), 1);
//		prodImpl.addProduit(new Produit("Imp Samsung",2000,100), 2);
//		prodImpl.addProduit(new Produit("Imp 3D",5000,150), 2);
//		prodImpl.addProduit(new Produit("Imp Laser",8000,50), 2);
//		prodImpl.addProduit(new Produit("CD 1",500,300), 3);
//		prodImpl.addProduit(new Produit("CD 2",600,200), 3);
//		prodImpl.addProduit(new Produit("CD 3",700,400), 3);
//		System.out.println("Liste des categories");
		
		//Liste des categories
//		System.out.println("====================");
//		List<Categorie> cats = prodImpl.getAllCategories();
//		for(Categorie cat : cats) {
//			System.out.println("* "+cat.toString());
//		}
		//Recherche des produits par Id Categorie
//		System.out.println();
//		System.out.println("Liste desproduits");
//		System.out.println("====================");
//		List<Produit> prods = prodImpl.getProduitsParCat(1);
//		for(Produit prod : prods) {
//			System.out.println(prod.getName());
//		}
		
		//Recherche des produits par Mot clé Categorie
		List<Produit> prods1 = prodImpl.getProduitsParMC("p");
		for(Produit prod : prods1) {
			System.out.println(prod.getName()
					+"\n"+prod.getPrix()
					+"\n"+prod.getQuantite()
					+"\n"+prod.getCategorie().getNamecategorie());
		}
		
	}

}
