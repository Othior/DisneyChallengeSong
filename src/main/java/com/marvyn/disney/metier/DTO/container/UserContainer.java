package com.marvyn.disney.metier.DTO.container;

import java.util.List;

import com.marvyn.disney.metier.DTO.UserDTO;

public class UserContainer extends ElementsContainer<UserDTO>{
    public UserContainer(List<UserDTO> list, int count) {
        super(list, count);
    }
}
