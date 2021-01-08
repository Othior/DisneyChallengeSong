package com.marvyn.disney.DAL.entities;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Roue implements Serializable {
    
    @Id
    @Column(name="roue_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "roue_gage")
    private String gage;

    
}
