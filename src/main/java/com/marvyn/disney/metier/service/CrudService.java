package com.marvyn.disney.metier.service;

import java.util.List;

public interface CrudService<DTO, ID>{
    void create(DTO toCreate);
    DTO getOne(ID id);
    List<DTO> getALl();
    void update(DTO toUpdate,ID id);
    void delete(ID toDelete);
}
