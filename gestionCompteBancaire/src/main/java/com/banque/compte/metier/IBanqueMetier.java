package com.banque.compte.metier;

import org.springframework.data.domain.Page;
import com.banque.compte.entities.Compte;
import com.banque.compte.entities.Operation;

public interface IBanqueMetier {
	
	public Compte consulterCompte(String codeCompte);
	public void verser(String codeCompte, double montant );
	public void retirer(String codeCompte, double montant);
	public void virement(String codeCompte1, String codeCompte2, double montant);
	public Page<Operation> listOperations(String codeCompte, int page, int size);
	

}
