package com.abdullah.gamerhub.entity;

import com.abdullah.gamerhub.entity.enums.MatchRound;
import com.abdullah.gamerhub.entity.enums.MatchStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "matches")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Match extends BaseEntity {


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MatchRound round;

    private Integer matchNumber;

    private LocalDateTime scheduledAt;

    private LocalDateTime startedAt;

    private LocalDateTime finishedAt;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private MatchStatus status = MatchStatus.SCHEDULED;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tournament_id", nullable = false)
    private Tournament tournament;

    @OneToMany(
            mappedBy = "match",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Builder.Default
    private List<MatchParticipant> participants = new ArrayList<>();
}
