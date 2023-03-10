package com.banque.compte.entities;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte {
	
	private static final long serialVersionUID = 1L;
	private double decouvert;

	public CompteCourant() {
		
	}

	public CompteCourant(String codeCompte, Date dateCreation, double solde, Client client, double decouvert) {
		super(codeCompte, dateCreation, solde, client);
		this.decouvert = decouvert;
	}



	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	
	

}
