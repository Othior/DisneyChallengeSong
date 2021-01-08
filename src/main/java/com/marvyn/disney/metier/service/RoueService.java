package com.marvyn.disney.metier.service;

import java.util.List;
import java.util.stream.Collectors;

import com.marvyn.disney.DAL.entities.Roue;
import com.marvyn.disney.DAL.repository.RoueRepository;
import com.marvyn.disney.metier.DTO.RoueDTO;
import com.marvyn.disney.metier.mapper.RoueMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoueService implements CrudService<RoueDTO, Integer> {

    @Autowired
    private RoueMapper mapper;
    @Autowired
    private RoueRepository repo;

    @Override
    public void create(RoueDTO toCreate) {
        repo.save(mapper.toENTITY(toCreate));
    }

    @Override
    public RoueDTO getOne(Integer id) {
        Roue roue = repo.findById(id).orElseThrow(null);
        return mapper.toDTO(roue);
    }

    @Override
    public List<RoueDTO> getALl() {
        return repo.findAll().stream()
        .map(mapper::toDTO)
        .collect(Collectors.toList());
    }

    @Override
    public void update(RoueDTO toUpdate,Integer id) {

        Roue exist = repo.findById(id).orElse(null);

        exist.setGage(toUpdate.getGage());

        repo.save(exist);
    }

    @Override
    public void delete(Integer toDelete) {
        repo.deleteById(toDelete);
    }
    
}
