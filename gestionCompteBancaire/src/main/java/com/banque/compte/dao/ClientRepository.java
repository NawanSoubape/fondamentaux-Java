package com.banque.compte.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banque.compte.entities.Client;


public interface ClientRepository extends JpaRepository<Client, Long> {

}
