package com.abdullah.gamerhub.dto.game.projection;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GameStatisticsDto {

    private Long gameId;

    private String gameName;

    private Long teamsCount;

    private Long tournamentsCount;
}
