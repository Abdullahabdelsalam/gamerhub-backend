package com.abdullah.gamerhub.dto.teamGame.response;

import com.abdullah.gamerhub.dto.team.response.TeamSummaryResponse;
import com.abdullah.gamerhub.entity.enums.GameDivision;
import com.abdullah.gamerhub.entity.enums.GameRank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamGameRankingResponse {

    private TeamSummaryResponse team;

    private Integer rankingPoints;

    private GameRank rank;

    private GameDivision division;

}
