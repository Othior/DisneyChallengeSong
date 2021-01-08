package com.marvyn.disney.metier.mapper;

import com.marvyn.disney.DAL.entities.Carte;
import com.marvyn.disney.metier.DTO.CarteDTO;

import org.springframework.stereotype.Component;

@Component
public class CarteMapper implements Mapper<CarteDTO, Carte> {

    @Override
    public CarteDTO toDTO(Carte entity) {
        if(entity == null) return null;

        CarteDTO carteDTO = new CarteDTO();
        
        carteDTO.setId(entity.getId());
        carteDTO.setName(entity.getName());
        carteDTO.setUrl(entity.getUrl());

        return carteDTO;
    }

    @Override
    public Carte toENTITY(CarteDTO dto) {
        if(dto == null) return null;

        Carte entity = new Carte();
        
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setUrl(dto.getUrl());

        return entity;
    }
    
}
