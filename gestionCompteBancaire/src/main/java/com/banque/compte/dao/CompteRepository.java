package com.banque.compte.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banque.compte.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, String> {
	
}
