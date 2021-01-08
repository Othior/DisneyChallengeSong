package com.marvyn.disney.metier.mapper;

import com.marvyn.disney.DAL.entities.User;
import com.marvyn.disney.metier.DTO.UserDTO;

import org.springframework.stereotype.Component;

@Component
public class UserMapper implements Mapper<UserDTO, User>{

    
    @Override
    public UserDTO toDTO(User entity) {

        if(entity == null) return null;

        UserDTO userDTO = new UserDTO();

        userDTO.setId(entity.getId());
        userDTO.setEmail(entity.getEmail());
        userDTO.setPseudo(entity.getPseudo());
        userDTO.setPassword(entity.getPassword());

        return userDTO;
    }

    @Override
    public User toENTITY(UserDTO dto) {
        if(dto == null) return null;

        User user = new User();

        user.setId(dto.getId());
        user.setEmail(dto.getEmail());
        user.setPseudo(dto.getPseudo());
        user.setPassword(dto.getPassword());

        return user;

    }
    
}
