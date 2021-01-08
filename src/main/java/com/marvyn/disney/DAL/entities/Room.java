package com.marvyn.disney.DAL.entities;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Room implements Serializable {

    @Id
    @Column(name="room_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_user_room",nullable = false)
    private User idUser;
    
}
