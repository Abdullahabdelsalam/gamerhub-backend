package com.abdullah.gamerhub.dto.matchParticipant.response;

import com.abdullah.gamerhub.dto.match.response.MatchSummaryResponse;
import com.abdullah.gamerhub.dto.tournamentPlayer.response.TournamentPlayerSummaryResponse;
import com.abdullah.gamerhub.dto.tournamentTeam.response.TournamentTeamSummaryResponse;
import com.abdullah.gamerhub.entity.enums.MatchSide;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchParticipantResponse {

    private Long id;

    private MatchSide side;

    private Integer score;

    private Boolean winner;

    private Boolean checkedIn;

    private Boolean forfeited;

    private MatchSummaryResponse match;

    private TournamentPlayerSummaryResponse player;

    private TournamentTeamSummaryResponse team;

}
