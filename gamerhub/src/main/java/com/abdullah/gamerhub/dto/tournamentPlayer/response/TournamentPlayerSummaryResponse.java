package com.abdullah.gamerhub.dto.tournamentPlayer.response;

import com.abdullah.gamerhub.dto.user.response.UserSummaryResponse;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentPlayerSummaryResponse {
    private Long id;

    private UserSummaryResponse player;
}
