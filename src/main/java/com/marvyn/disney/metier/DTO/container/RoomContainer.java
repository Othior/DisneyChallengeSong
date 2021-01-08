package com.marvyn.disney.metier.DTO.container;

import java.util.List;

import com.marvyn.disney.metier.DTO.RoomDTO;

public class RoomContainer extends ElementsContainer<RoomDTO> {
    public RoomContainer(List<RoomDTO> list, int count) {
        super(list, count);
    }
}