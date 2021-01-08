package com.marvyn.disney.DAL.repository;

import com.marvyn.disney.DAL.entities.Carte;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteRepository extends JpaRepository<Carte, Integer> {
    
}
