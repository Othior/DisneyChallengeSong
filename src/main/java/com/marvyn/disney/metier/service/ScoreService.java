package com.marvyn.disney.metier.service;

import java.util.List;
import java.util.stream.Collectors;

import com.marvyn.disney.DAL.entities.Score;
import com.marvyn.disney.DAL.repository.ScoreRepository;
import com.marvyn.disney.metier.DTO.ScoreDTO;
import com.marvyn.disney.metier.mapper.ScoreMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.XmlBeamHttpMessageConverter;
import org.springframework.stereotype.Service;

@Service
public class ScoreService implements CrudService<ScoreDTO, Integer> {

    @Autowired
    private ScoreMapper mapper;
    @Autowired
    private ScoreRepository repo;

    @Override
    public void create(ScoreDTO toCreate) {
        System.out.println( " idUser => " + toCreate.getIdUser());

        repo.save(mapper.toENTITY(toCreate));
    }

    @Override
    public ScoreDTO getOne(Integer id) {
        Score score = repo.findById(id).orElseThrow(null);
        return mapper.toDTO(score);
    }

    @Override
    public List<ScoreDTO> getALl() {
        return repo.findAll().stream()
        .map(mapper::toDTO)
        .collect(Collectors.toList());
    }

    @Override
    public void update(ScoreDTO toUpdate,Integer id) {

        Score exist = repo.findById(id).orElse(null);

        exist.setPoint(toUpdate.getPoint());
        repo.save(mapper.toENTITY(toUpdate));
    }

    @Override
    public void delete(Integer toDelete) {
        repo.deleteById(toDelete);
    }
    
}
