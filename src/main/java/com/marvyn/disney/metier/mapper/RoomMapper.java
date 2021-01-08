package com.marvyn.disney.metier.mapper;

import com.marvyn.disney.DAL.entities.Room;
import com.marvyn.disney.metier.DTO.RoomDTO;

import org.springframework.stereotype.Component;

@Component
public class RoomMapper implements Mapper<RoomDTO, Room> {

    @Override
    public RoomDTO toDTO(Room entity) {
        if(entity == null) return null;

        RoomDTO dto = new RoomDTO();

        dto.setId(entity.getId());
        dto.setIdUser(entity.getIdUser());

        return dto;
    }

    @Override
    public Room toENTITY(RoomDTO dto) {

        if(dto == null) return null;

        Room entity = new Room();

        entity.setId(dto.getId());
        entity.setIdUser(dto.getIdUser());

        return entity;
    }
    
}
