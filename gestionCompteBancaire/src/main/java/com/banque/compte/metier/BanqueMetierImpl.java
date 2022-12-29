package com.banque.compte.metier;

import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.Printable;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.banque.compte.dao.CompteRepository;
import com.banque.compte.dao.OperationRepository;
import com.banque.compte.entities.Compte;
import com.banque.compte.entities.CompteCourant;
import com.banque.compte.entities.Operation;
import com.banque.compte.entities.Retrait;
import com.banque.compte.entities.Versement;

@Service
@Transactional
public class BanqueMetierImpl implements IBanqueMetier{
	@Autowired
	private CompteRepository compteRepository;
	
	@Autowired
	private OperationRepository operationRepository;
	@Override
	public Compte consulterCompte(String codeCompte) {
		Compte cp = compteRepository.findOne(codeCompte);
		if(cp == null) throw new RuntimeException("Compte introuvable !");
		return cp;
	}

	@Override
	public void verser(String codeCompte, double montant) {
		Compte cp = consulterCompte(codeCompte);
		Versement v = new Versement(montant, cp, new Date());
		operationRepository.save(v);
		cp.setSolde(cp.getSolde()+montant);
		compteRepository.save(cp);
		
		
	}

	@Override
	public void retirer(String codeCompte, double montant) {
		Compte cp = consulterCompte(codeCompte);
		double facilitesCaisse = 0;
		if(cp instanceof CompteCourant)
			facilitesCaisse = ((CompteCourant) cp).getDecouvert();
		if(cp.getSolde()+facilitesCaisse<montant)
			throw new RuntimeException("Solde insuffisant !");
		Retrait r = new Retrait(montant, cp, new Date());
		operationRepository.save(r);
		cp.setSolde(cp.getSolde()-montant);
		compteRepository.save(cp);
		
		
	}

	@Override
	public void virement(String codeCompte1, String codeCompte2, double montant) {
		retirer(codeCompte1, montant);
		verser(codeCompte2, montant);
		
	}

	@Override
	public Page<Operation> listOperations(String codeCompte, int page, int size) {
		return operationRepository.listOperations(codeCompte, new PageRequest(page, size));
	}

}
