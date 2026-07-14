package com.abdullah.gamerhub.dto.tournamentPlayer.response;

import com.abdullah.gamerhub.dto.tournament.response.TournamentSummaryResponse;
import com.abdullah.gamerhub.dto.user.response.UserSummaryResponse;
import com.abdullah.gamerhub.entity.enums.TournamentRegistrationStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentPlayerResponse {

    private Long id;

    private UserSummaryResponse player;

    private TournamentSummaryResponse tournament;

    private Integer score;

    private Integer rank;

    private Boolean checkedIn;

    private Boolean eliminated;

    private TournamentRegistrationStatus status;
}
