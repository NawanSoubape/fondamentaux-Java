package com.banque.compte.entities;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte {
	
	private static final long serialVersionUID = 1L;
	private double taux;

	public CompteEpargne() {
		
	}

	public CompteEpargne(String codeCompte, Date dateCreation, double solde, Client client, double taux) {
		super(codeCompte, dateCreation, solde, client);
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	
	

}
