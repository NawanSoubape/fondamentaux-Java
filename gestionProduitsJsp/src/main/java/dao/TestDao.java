package dao;

import java.util.List;

import metier.entities.Produit;

public class TestDao {

	public static void main(String[] args) {
		ProduitDaoImpl dao = new ProduitDaoImpl();
		//Test de la méthode d'ajout des produits
//		Produit p3 = dao.save(new Produit("HP 560", 4000,100));
//		Produit p4 = dao.save(new Produit("Imprimante HP 250", 1000,10));
//		System.out.println(p3.toString());
//		System.out.println(p4.toString());
		
		//Test de la methode de recherche des produits
		System.out.println("Recherche des produits");
		List<Produit> prods = dao.produitsParMC("%"+"hp"+"%");
		for(Produit p : prods) {
			System.out.println(p.toString());
		}
	}

}
