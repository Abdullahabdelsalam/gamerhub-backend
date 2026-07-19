package com.abdullah.gamerhub.dto.teamGame.response;

import com.abdullah.gamerhub.dto.game.response.GameSummaryResponse;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamGameSummaryResponse {

    private Long id;

    private GameSummaryResponse game;

}
