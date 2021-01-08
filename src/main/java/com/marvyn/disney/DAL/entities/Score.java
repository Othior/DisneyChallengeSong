package com.marvyn.disney.DAL.entities;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter @Setter
@NoArgsConstructor
public class Score implements Serializable {

    @Id
    @Column(name = "score_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "score_point")
    private int point;

    @ManyToOne
    @JoinColumn(name = "id_user_score",nullable = false)
    private User idUser;
}
