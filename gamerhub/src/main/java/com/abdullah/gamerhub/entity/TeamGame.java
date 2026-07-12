package com.abdullah.gamerhub.entity;


import com.abdullah.gamerhub.entity.enums.GameDivision;
import com.abdullah.gamerhub.entity.enums.GameRank;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "team_games",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"team_id", "game_id"}
                )
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamGame extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;

    @Builder.Default
    private Boolean active = false;

    //convert to class in v2
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Builder.Default
    private GameRank rank = GameRank.GAME_RANK_UNRANKED;

    @Enumerated(EnumType.STRING)
    private GameDivision division;

    private Integer wins;

    private Integer losses;

    private Integer draws;

    private Integer rankingPoints;




}
