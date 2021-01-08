package com.marvyn.disney.presentation;

import com.marvyn.disney.metier.DTO.RoomDTO;
import com.marvyn.disney.metier.service.RoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
public class RoomController {
    
    @Autowired
    private RoomService service;

    @PostMapping("/create")
    public void create(@RequestBody RoomDTO toCreate){
        service.create(toCreate);
    }
    
    // @GetMapping("/list")
    // public List<CarteDTO> getAll(){
    //     return service.getALl();
    // }

    @GetMapping("/{id}")
    public RoomDTO getOne(@PathVariable Integer id){
        return service.getOne(id);
    }
    
    // @PutMapping("/update/{id}")
    // public void update(@RequestBody CarteDTO carte,@PathVariable int id) {
    //     service.update(carte,id);
    // }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
