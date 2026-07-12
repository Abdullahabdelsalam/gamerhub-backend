package com.abdullah.gamerhub.entity;

import com.abdullah.gamerhub.entity.enums.TournamentRegistrationStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "tournament_teams",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {
                                "tournament_id",
                                "team_id"
                        }
                )
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentTeam extends BaseEntity {

    private Integer seed;

    @Builder.Default
    private Integer score = 0;

    private Integer rank;

    @Builder.Default
    private Boolean eliminated = false;

    @Builder.Default
    private Boolean checkedIn = false;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Builder.Default
    private TournamentRegistrationStatus status =
            TournamentRegistrationStatus.PENDING;

    // Tournament
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "tournament_id",
            nullable = false
    )
    private Tournament tournament;

    // Team
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "team_id",
            nullable = false
    )
    private Team team;
}
