package com.banque.compte.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

import java.util.Collection;

@Entity 
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_CPTE", discriminatorType = DiscriminatorType.STRING,length = 2)

public abstract class Compte implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private String codeCompte;
	private Date dateCreation;
	private double solde;
	@ManyToOne
	@JoinColumn(name = "CODE_CLIENT")
	private Client client;
	@OneToMany(mappedBy = "compte", fetch = FetchType.LAZY)
	private Collection<Operation> operations;
	
	public Compte() {
		
	}
		
	public Compte(String codeCompte, Date dateCreation, double solde, Client client) {
		super();
		this.codeCompte = codeCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
		this.client = client;
	}


	public String getCodeCompte() {
		return codeCompte;
	}
	public void setCodeCompte(String codeCompte) {
		this.codeCompte = codeCompte;
	}
	
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Collection<Operation> getOperations() {
		return operations;
	}
	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
	}
	
	

}
