package com.marvyn.disney.DAL.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter @Setter
@NoArgsConstructor
public class User implements Serializable{

    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="user_pseudo")
    private String pseudo;

    @Column(name="user_email")
    private String email;

    @Column(name="user_password")
    private String password;

    @OneToMany(mappedBy = "id")
    private Collection<Score> scores;

    @OneToMany(mappedBy = "id")
    private Collection<Room> rooms;
    
}
