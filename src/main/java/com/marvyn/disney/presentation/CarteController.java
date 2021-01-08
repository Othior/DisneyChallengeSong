package com.marvyn.disney.presentation;

import java.util.List;

import com.marvyn.disney.metier.DTO.CarteDTO;
import com.marvyn.disney.metier.service.CarteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carte")
public class CarteController {

    @Autowired
    private CarteService service;

    @PostMapping("/create")
    public void create(@RequestBody CarteDTO toCreate){
        service.create(toCreate);
    }
    
    @GetMapping("/list")
    public List<CarteDTO> getAll(){
        return service.getALl();
    }

    @GetMapping("/read/{id}")
    public CarteDTO getOne(@PathVariable Integer id){
        return service.getOne(id);
    }
    
    @PutMapping("/update/{id}")
    public void update(@RequestBody CarteDTO carte,@PathVariable int id) {
        service.update(carte,id);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
    
}
