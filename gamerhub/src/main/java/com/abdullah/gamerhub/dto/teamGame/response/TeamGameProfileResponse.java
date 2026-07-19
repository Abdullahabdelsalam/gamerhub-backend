package com.abdullah.gamerhub.dto.teamGame.response;

import com.abdullah.gamerhub.dto.game.response.GameSummaryResponse;
import com.abdullah.gamerhub.entity.enums.GameDivision;
import com.abdullah.gamerhub.entity.enums.GameRank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamGameProfileResponse {

    private Long id;

    private GameSummaryResponse game;

    private GameRank rank;

    private GameDivision division;

    private Integer wins;

    private Integer losses;

    private Integer draws;

    private Integer rankingPoints;

}
