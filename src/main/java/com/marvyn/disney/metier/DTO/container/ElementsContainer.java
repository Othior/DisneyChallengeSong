package com.marvyn.disney.metier.DTO.container;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ElementsContainer<DTO> {
    
    private final List<DTO> list;
    private final int count;
}
