package com.marvyn.disney.metier.DTO;

import java.util.Collection;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    
    private int id;
    private String pseudo;
    private String email;
    private String password;
    private Collection<Integer> scores;
    private Collection<Integer> rooms;
}
