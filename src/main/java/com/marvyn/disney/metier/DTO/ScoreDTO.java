package com.marvyn.disney.metier.DTO;

import com.marvyn.disney.DAL.entities.User;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class ScoreDTO {

    private int id;

    private int point;

    
    private User idUser;
    
}
