package com.apirest.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.apirest.model.entity.Client;

@Repository
public interface iClientRepository extends JpaRepository<Client, Integer>{
    
}
