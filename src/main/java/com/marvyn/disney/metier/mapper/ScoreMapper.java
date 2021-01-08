package com.marvyn.disney.metier.mapper;

import com.marvyn.disney.DAL.entities.Score;
import com.marvyn.disney.metier.DTO.ScoreDTO;

import org.springframework.stereotype.Component;

@Component
public class ScoreMapper implements Mapper<ScoreDTO, Score> {

    

    @Override
    public ScoreDTO toDTO(Score entity) {

       if(entity == null) return null;

       ScoreDTO dto = new ScoreDTO();

       dto.setId(entity.getId());
       dto.setPoint(entity.getPoint());
       dto.setIdUser(entity.getIdUser());

       return dto;
    }

    @Override
    public Score toENTITY(ScoreDTO dto) {

        if(dto == null) return null;

       Score entity = new Score();

       entity.setId(dto.getId());
       entity.setPoint(dto.getPoint());
       entity.setIdUser(dto.getIdUser());

       return entity;
    }
    
}
