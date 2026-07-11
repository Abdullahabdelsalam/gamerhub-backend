package com.abdullah.gamerhub.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tournaments")
public class Tournament extends BaseEntity{



    // game relation
    @ManyToOne

    @JoinColumn(name="game_id")

    private Game game;

    //Team
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "team_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_tournament_team")
    )
    private Team team;
}
