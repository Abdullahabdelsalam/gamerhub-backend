package com.abdullah.gamerhub.entity;

import com.abdullah.gamerhub.entity.enums.MatchSide;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(
        name = "match_participants",
        indexes = {
                @Index(name = "idx_mp_match", columnList = "match_id"),
                @Index(name = "idx_mp_player", columnList = "tournament_player_id"),
                @Index(name = "idx_mp_team", columnList = "tournament_team_id")
        },
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_match_player",
                        columnNames = {
                                "match_id",
                                "tournament_player_id"
                        }
                ),
                @UniqueConstraint(
                        name = "uk_match_team",
                        columnNames = {
                                "match_id",
                                "tournament_team_id"
                        }
                )
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchParticipant extends BaseEntity {

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private MatchSide side;

    @Min(0)
    @Builder.Default
    @Column(nullable = false)
    private Integer score = 0;

    @Builder.Default
    @Column(nullable = false)
    private boolean  winner = false;

    @Builder.Default
    @Column(nullable = false)
    private boolean  checkedIn = false;

    @Builder.Default
    @Column(nullable = false)
    private boolean forfeited = false;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "match_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_match_participant_match")
    )
    private Match match;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "team_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_team_participant_match")
    )
    private Team team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "tournament_player_id",
            foreignKey = @ForeignKey(name = "fk_match_participant_player")
    )
    private TournamentPlayer tournamentPlayer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "tournament_team_id",
            foreignKey = @ForeignKey(name = "fk_match_participant_team")
    )
    private TournamentTeam tournamentTeam;


}