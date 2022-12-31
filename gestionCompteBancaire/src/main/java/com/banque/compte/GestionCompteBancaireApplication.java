package com.banque.compte;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.banque.compte.dao.ClientRepository;
import com.banque.compte.dao.CompteRepository;
import com.banque.compte.dao.OperationRepository;
import com.banque.compte.entities.Client;
import com.banque.compte.entities.Compte;
import com.banque.compte.entities.CompteCourant;
import com.banque.compte.entities.CompteEpargne;
import com.banque.compte.entities.Operation;
import com.banque.compte.entities.Retrait;
import com.banque.compte.entities.Versement;
import com.banque.compte.metier.IBanqueMetier;

@SpringBootApplication
public class GestionCompteBancaireApplication implements CommandLineRunner {
	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private CompteRepository compteRepository;

	@Autowired
	private OperationRepository operationRepository;

	@Autowired
	private IBanqueMetier iBanqueMetier;

	public static void main(String[] args) {
		SpringApplication.run(GestionCompteBancaireApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//création de client
		/*
		 * Client c1 = clientRepository.save(new Client("Soubapé",
		 * "soubape@gmail.com")); Client c2 = clientRepository.save(new Client("Nawan",
		 * "nawan@gmail.com"));
		 * 
		 * //création de comptes
		 * 
		 * Compte cpt1 = compteRepository.save(new CompteCourant("C001", new Date(),
		 * 9000, c2, 5000));
		 * 
		 * Compte cpt2 = compteRepository.save(new CompteCourant("C002", new Date(),
		 * 7000, c2, 3000)); Compte cpt3 = compteRepository.save(new
		 * CompteEpargne("C003", new Date(), 5000, c1, 4.5));
		 * 
		 * //mise en oeuvre des opérations
		 * 
		 * 
		 * Operation op1 = operationRepository.save(new Versement(6000, cpt3, new
		 * Date())); Operation op2 = operationRepository.save(new Retrait(1000, cpt1,
		 * new Date())); Operation op3 = operationRepository.save(new Versement(10000,
		 * cpt2, new Date()));
		 * 
		 * 
		 * //Versement iBanqueMetier.verser("C001", 111111);
		 * iBanqueMetier.verser("C001", 222222); iBanqueMetier.retirer("C001", 400);
		 * 
		 * 
		 * //virement iBanqueMetier.virement("C001", "C002", 40000);
		 * 
		 * //Consultation compte iBanqueMetier.consulterCompte("C001");
		 */
	}
}
