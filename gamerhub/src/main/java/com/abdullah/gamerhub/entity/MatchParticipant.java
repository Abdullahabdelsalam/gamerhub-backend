package com.abdullah.gamerhub.entity;

import com.abdullah.gamerhub.entity.enums.MatchSide;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "match_participants",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {
                                "match_id",
                                "user_id"
                        }
                ),
                @UniqueConstraint(
                        columnNames = {
                                "match_id",
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
public class MatchParticipant extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private MatchSide side;

    @Builder.Default
    private Integer score = 0;

    @Builder.Default
    private Boolean winner = false;

    @Builder.Default
    private Boolean checkedIn = false;

    @Builder.Default
    private Boolean forfeited = false;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "match_id")
    private Match match;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User player;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;
}
