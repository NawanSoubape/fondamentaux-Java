package jdbc1;

import java.util.List;
import java.util.Scanner;

import metier.Produit;
import metier.ProduitMetierImpl;

public class Test {
public static void main(String[] args) {
	ProduitMetierImpl metier = new ProduitMetierImpl();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Nom produit : ");
	String nom = sc.next();
	System.out.println("Quantité produit : ");
	int quantite = sc.nextInt();
	Produit pr = new Produit(nom,quantite);
	metier.addProduit(pr);
	System.out.print("Mot clé : ");
	
	String mc  = sc.next();
	List<Produit> prods = metier.produitsParMC(mc);
	for(Produit p : prods) {
		System.out.println(p.getIdProduit()+"\t"+p.getNomProduit()+"\t"+p.getQuantite());
	}
	sc.close();
}
	


}
