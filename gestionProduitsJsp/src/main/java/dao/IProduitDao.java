package dao;

import java.util.List;

import metier.entities.Produit;

public interface IProduitDao {

	public Produit save(Produit p);
	public List<Produit> produitsParMC(String mc);
	public Produit getProduitParId(Long id);
	public Produit updateProdui(Produit p);
	public void deleteProduit(Long id);
}
