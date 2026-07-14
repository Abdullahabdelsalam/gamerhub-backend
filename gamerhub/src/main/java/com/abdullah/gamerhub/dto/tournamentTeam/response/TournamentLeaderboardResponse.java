package com.abdullah.gamerhub.dto.tournamentTeam.response;

import com.abdullah.gamerhub.dto.team.response.TeamSummaryResponse;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentLeaderboardResponse {

    private Integer rank;

    private TeamSummaryResponse team;

    private Integer score;
}
