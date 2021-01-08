package com.marvyn.disney.metier.mapper;

import com.marvyn.disney.DAL.entities.Roue;
import com.marvyn.disney.metier.DTO.RoueDTO;

import org.springframework.stereotype.Component;

@Component
public class RoueMapper implements Mapper<RoueDTO, Roue> {

    @Override
    public RoueDTO toDTO(Roue entity) {
        if(entity == null) return null;

        RoueDTO dto = new RoueDTO();

        dto.setId(entity.getId());
        dto.setGage(entity.getGage());

        return dto;
    }

    @Override
    public Roue toENTITY(RoueDTO dto) {
        if(dto == null) return null;

        Roue entity = new Roue();

        entity.setId(dto.getId());
        entity.setGage(dto.getGage());

        return entity;
    }
    
}
