package com.banque.compte.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_OP", discriminatorType = DiscriminatorType.STRING, length = 1)
public abstract class Operation implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long numero;
	private double montant;
	@ManyToOne
	@JoinColumn(name = "CODE_CPTE")
	private Compte compte;
	private Date dateOperation;
	
	public Operation() {
	
	}

	public Operation(double montant, Compte compte, Date dateOperation) {
		super();
		this.montant = montant;
		this.compte = compte;
		this.dateOperation = dateOperation;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	
	
	
	
	
}
