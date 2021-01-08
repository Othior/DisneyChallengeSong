package com.marvyn.disney.DAL.entities;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Carte implements Serializable {
    
    @Id
    @Column(name="carte_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "carte_name")
    private String name;

    @Column(name = "url_image")
    private String url;
    
}
