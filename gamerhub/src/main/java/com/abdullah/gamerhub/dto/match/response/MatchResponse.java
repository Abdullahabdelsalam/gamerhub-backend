package com.abdullah.gamerhub.dto.match.response;

import com.abdullah.gamerhub.dto.tournament.response.TournamentSummaryResponse;
import com.abdullah.gamerhub.entity.enums.MatchRound;
import com.abdullah.gamerhub.entity.enums.MatchStatus;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchResponse {
    private Long id;

    private String title;

    private MatchRound round;

    private Integer bestOf;

    private MatchStatus status;

    private LocalDateTime scheduledAt;

    private LocalDateTime startedAt;

    private LocalDateTime finishedAt;

    private Integer matchNumber;

    private TournamentSummaryResponse tournament;
}
