package com.banque.compte.entities;

import java.util.Date;


import jakarta.persistence.*;

@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation {

	
	private static final long serialVersionUID = 1L;

	public Retrait() {
		super();
		
	}

	public Retrait(double montant, Compte compte, Date dateOperation) {
		super(montant, compte, dateOperation);
	
	}
	
	

}
