package com.abdullah.gamerhub.dto.tournamentTeam.response;

import com.abdullah.gamerhub.dto.team.response.TeamSummaryResponse;
import com.abdullah.gamerhub.entity.enums.TournamentRegistrationStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentTeamProfileResponse {

    private Long id;

    private TeamSummaryResponse team;

    private Integer score;

    private Integer rank;

    private Boolean checkedIn;

    private Boolean eliminated;

    private TournamentRegistrationStatus status;

}
