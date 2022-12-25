package metier;

import java.util.List;

public interface IProduitMetier {
	
	public List<Produit> produitsParMC(String mc);
	public void addProduit(Produit p);

}
