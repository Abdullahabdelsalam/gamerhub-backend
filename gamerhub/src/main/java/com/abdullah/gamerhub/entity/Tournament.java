package com.abdullah.gamerhub.entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Tournament extends BaseEntity{



    // game relation
    @ManyToOne

    @JoinColumn(name="game_id")

    private Game game;
}
