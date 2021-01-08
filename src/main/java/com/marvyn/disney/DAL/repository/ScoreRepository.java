package com.marvyn.disney.DAL.repository;

import com.marvyn.disney.DAL.entities.Score;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Integer> {
    
}
