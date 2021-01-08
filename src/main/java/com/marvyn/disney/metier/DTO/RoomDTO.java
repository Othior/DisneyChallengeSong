package com.marvyn.disney.metier.DTO;

import java.util.Collection;
import java.util.List;

import com.marvyn.disney.DAL.entities.User;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class RoomDTO {

    private int id;

    private User idUser;
    
}
