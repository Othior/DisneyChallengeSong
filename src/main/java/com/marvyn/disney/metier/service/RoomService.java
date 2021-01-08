package com.marvyn.disney.metier.service;

import java.util.List;
import java.util.stream.Collectors;

import com.marvyn.disney.DAL.entities.Room;
import com.marvyn.disney.DAL.repository.RoomRepository;
import com.marvyn.disney.metier.DTO.RoomDTO;
import com.marvyn.disney.metier.mapper.RoomMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    @Autowired
    private RoomMapper mapper;
    @Autowired
    private RoomRepository repo;

    public void create(RoomDTO toCreate) {
        repo.save(mapper.toENTITY(toCreate));

    }

    public RoomDTO getOne(Integer id) {
        Room room = repo.findById(id).orElseThrow(null);
        return mapper.toDTO(room);
    }

    // @Override
    // public List<RoomDTO> getALl() {
    //     return repo.findAll().stream()
    //     .map(mapper::toDTO)
    //     .collect(Collectors.toList());
    // }

    // @Override
    // public void update(RoomDTO toUpdate,Integer id) {
    //     Room exist = repo.findById(id).orElse(null);

        
    //     repo.save(mapper.toENTITY(toUpdate));
    // }

    public void delete(Integer toDelete) {
        repo.deleteById(toDelete);
    }
    
}
