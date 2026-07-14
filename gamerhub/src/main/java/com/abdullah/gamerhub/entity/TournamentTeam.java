package com.abdullah.gamerhub.entity;

import com.abdullah.gamerhub.entity.enums.TournamentRegistrationStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(
        name = "tournament_teams",
        indexes = {
                @Index(name = "idx_tt_tournament", columnList = "tournament_id"),
                @Index(name = "idx_tt_team", columnList = "team_id"),
                @Index(name = "idx_tt_status", columnList = "status")
        },
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_tournament_team",
                        columnNames = {"tournament_id", "team_id"}
                )
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentTeam extends BaseEntity {

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
            foreignKey = @ForeignKey(name = "fk_tt_tournament")
    )
    private Tournament tournament;

    // Team
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "team_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_tt_team")
    )
    private Team team;
}
