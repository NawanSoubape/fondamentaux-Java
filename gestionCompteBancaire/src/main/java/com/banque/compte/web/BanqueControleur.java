package com.banque.compte.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.banque.compte.entities.Compte;
import com.banque.compte.entities.Operation;
import com.banque.compte.metier.IBanqueMetier;

@Controller
public class BanqueControleur {
	
	@Autowired
	private IBanqueMetier iBanqueMetier;
	
	@RequestMapping("/operations")
	public String index() {
		return "comptes";
		
	}
	
	@RequestMapping("/consulterCompte")
	public String consulter(Model model,String codeCompte) {
		model.addAttribute("codeCompte",codeCompte);
		try {
			Compte cp = iBanqueMetier.consulterCompte(codeCompte);
			Page<Operation> pageOperations = iBanqueMetier.listOperations(codeCompte, 0, 4);
			model.addAttribute("listeOperations",pageOperations.getContent());
			model.addAttribute("compte", cp);
		} catch (Exception e) {
			model.addAttribute("exception"+e);
		}
		return "comptes";
		
	}
	
	@RequestMapping(value="/saveOperations", method=RequestMethod.POST)
	public String save( Model model,String typeOperations, 
			String codeCompte, double montant, String codeCompte2) {
		try {
			if(typeOperations.equals("VERS")) {
				iBanqueMetier.verser(codeCompte, montant);
			}
			else if(typeOperations.equals("RETR")) {
				iBanqueMetier.verser(codeCompte, montant);
			}
			if(typeOperations.equals("VIR")) {
				iBanqueMetier.virement(codeCompte, codeCompte2, montant);
			}
			
		} catch (Exception e) {
			model.addAttribute("error",e);
		}
		return "redirect/consulter?codeCompte="+codeCompte;
		
	}

}
