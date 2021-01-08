package com.marvyn.disney.presentation;

import java.util.List;

import com.marvyn.disney.metier.DTO.UserDTO;
import com.marvyn.disney.metier.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService service;

    @PostMapping("/create")
    public void create(@RequestBody UserDTO toCreate){
        service.create(toCreate);
    }
    
    @GetMapping("/list")
    public List<UserDTO> getAll(){
        return service.getALl();
    }

    @GetMapping("/read/{id}")
    public UserDTO getOne(@PathVariable Integer id){
        return service.getOne(id);
    }
    
    @PutMapping("/update/{id}")
    public void update(@RequestBody UserDTO carte,@PathVariable int id) {
        service.update(carte,id);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
