package com.marvyn.disney.metier.service;

import java.util.List;
import java.util.stream.Collectors;

import com.marvyn.disney.DAL.entities.Carte;
import com.marvyn.disney.DAL.repository.CarteRepository;
import com.marvyn.disney.metier.DTO.CarteDTO;
import com.marvyn.disney.metier.mapper.CarteMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarteService implements CrudService<CarteDTO, Integer> {

    @Autowired
    private CarteMapper mapper;
    @Autowired
    private CarteRepository repo;
    
    @Override
    public void create(CarteDTO toCreate) {
        repo.save(mapper.toENTITY(toCreate));
    }

    @Override
    public CarteDTO getOne(Integer id) {
        Carte carte = repo.findById(id).orElseThrow(null);
        return mapper.toDTO(carte);
    }

    @Override
    public List<CarteDTO> getALl() {
        return repo.findAll().stream()
        .map(mapper::toDTO)
        .collect(Collectors.toList());
    }

    @Override
    public void update(CarteDTO toUpdate,Integer id) {

        Carte exist = repo.findById(id).orElse(null);

        exist.setName(toUpdate.getName());
        exist.setUrl(toUpdate.getUrl());

        repo.save(exist);
    }

    @Override
    public void delete(Integer toDelete) {
        repo.deleteById(toDelete);
    }
    
}
