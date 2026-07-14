package com.abdullah.gamerhub.dto.tournamentPlayer.response;

import com.abdullah.gamerhub.dto.user.response.UserSummaryResponse;
import com.abdullah.gamerhub.entity.enums.TournamentRegistrationStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentPlayerProfileResponse {
    private Long id;

    private UserSummaryResponse player;

    private Integer score;

    private Integer rank;

    private Boolean checkedIn;

    private Boolean eliminated;

    private TournamentRegistrationStatus status;
}
