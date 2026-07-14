package com.abdullah.gamerhub.entity;

import com.abdullah.gamerhub.entity.enums.MatchRound;
import com.abdullah.gamerhub.entity.enums.MatchStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(   name = "matches",
        indexes = {
                @Index(name = "idx_match_tournament", columnList = "tournament_id"),
                @Index(name = "idx_match_status", columnList = "status"),
                @Index(name = "idx_match_round", columnList = "round"),
                @Index(name = "idx_match_scheduled_at", columnList = "scheduled_at")
        }
        )
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Match extends BaseEntity {

    @Size(max = 100)
    @Column(length = 100)
    private String title;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private MatchRound round;

    @NotNull
    @Min(1)
    @Max(9)
    @Column(nullable = false)
    private Integer bestOf;

    @Column(name = "scheduled_at")
    private LocalDateTime scheduledAt;

    @Column(name = "started_at")
    private LocalDateTime startedAt;

    @Column(name = "finished_at")
    private LocalDateTime finishedAt;

    @Min(1)
    @Column(name = "match_number")
    private Integer matchNumber;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    @Builder.Default
    private MatchStatus status = MatchStatus.SCHEDULED;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "winner_participant_id",
            foreignKey = @ForeignKey(name = "fk_match_winner")
    )
    private MatchParticipant winner;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "tournament_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_match_tournament")
    )
    private Tournament tournament;

    @OneToMany(
            mappedBy = "match",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @Builder.Default
    private List<MatchParticipant> participants = new ArrayList<>();


}
