package com.abdullah.gamerhub.entity;

import com.abdullah.gamerhub.entity.enums.TournamentRegistrationStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(
        name = "tournament_players",
        indexes = {
                @Index(name = "idx_tp_tournament", columnList = "tournament_id"),
                @Index(name = "idx_tp_player", columnList = "player_id"),
                @Index(name = "idx_tp_status", columnList = "status")
        },
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {
                                "tournament_id",
                                "player_id"
                        }
                )
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentPlayer extends BaseEntity{

    @Min(0)
    @Builder.Default
    @Column(nullable = false)
    private Integer score = 0;

    @Min(1)
    private Integer rank;

    @Builder.Default
    @Column(nullable = false)
    private boolean eliminated = false;

    @Builder.Default
    @Column(nullable = false)
    private boolean checkedIn = false;


    @NotNull
    @Builder.Default
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private TournamentRegistrationStatus status = TournamentRegistrationStatus.PENDING;

    // Tournament
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "tournament_id",
            nullable = false,
            foreignKey = @ForeignKey(
                    name = "fk_tp_tournament"
            )
    )
    private Tournament tournament;

    // Player
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "player_id",
            nullable = false,
            foreignKey = @ForeignKey(
                    name = "fk_tp_player"
            )
    )
    private User player;

    @OneToMany(
            mappedBy = "tournamentPlayer",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @Builder.Default
    private List<MatchParticipant> matchParticipants = new ArrayList<>();
}
