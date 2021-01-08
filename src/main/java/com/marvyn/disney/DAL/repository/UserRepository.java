package com.marvyn.disney.DAL.repository;

import com.marvyn.disney.DAL.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
