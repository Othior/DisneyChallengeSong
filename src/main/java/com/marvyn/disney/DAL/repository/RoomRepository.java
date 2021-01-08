package com.marvyn.disney.DAL.repository;

import com.marvyn.disney.DAL.entities.Room;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Integer> {
    
}
