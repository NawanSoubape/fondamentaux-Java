package com.banque.compte.entities;

import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("V")
public class Versement extends Operation{

	private static final long serialVersionUID = 1L;

	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Versement(double montant, Compte compte, Date dateOperation) {
		super(montant, compte, dateOperation);
		// TODO Auto-generated constructor stub
	}

	
}
