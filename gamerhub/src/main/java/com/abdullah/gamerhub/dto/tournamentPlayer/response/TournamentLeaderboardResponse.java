package com.abdullah.gamerhub.dto.tournamentPlayer.response;

import com.abdullah.gamerhub.dto.user.response.UserSummaryResponse;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentLeaderboardResponse {

    private Integer rank;

    private UserSummaryResponse player;

    private Integer score;
}
