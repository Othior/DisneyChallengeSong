package com.marvyn.disney.metier.service;

import java.util.List;
import java.util.stream.Collectors;

import com.marvyn.disney.DAL.entities.User;
import com.marvyn.disney.DAL.repository.UserRepository;
import com.marvyn.disney.metier.DTO.UserDTO;
import com.marvyn.disney.metier.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements CrudService<UserDTO, Integer> {

    @Autowired
    private UserMapper mapper;
    @Autowired
    private UserRepository repo;

    @Override
    public void create(UserDTO toCreate) {
        repo.save(mapper.toENTITY(toCreate));
    }

    @Override
    public UserDTO getOne(Integer id) {
        User user = repo.findById(id).orElseThrow(null);
        return mapper.toDTO(user);
    }

    @Override
    public List<UserDTO> getALl() {
        return repo.findAll().stream()
        .map(mapper::toDTO)
        .collect(Collectors.toList());
    }

    @Override
    public void update(UserDTO toUpdate,Integer id) {

        User exist = repo.findById(id).orElse(null);

        exist.setPseudo(toUpdate.getPseudo());
        exist.setEmail(toUpdate.getEmail());
        exist.setPassword(toUpdate.getPassword());

        repo.save(exist);
    }

    @Override
    public void delete(Integer toDelete) {
        repo.deleteById(toDelete);
    }

    // public void login(User user){
        
    //     user.getEmail();
    //     user.getPassword();
    // }
    
}
