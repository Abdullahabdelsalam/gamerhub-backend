package com.abdullah.gamerhub.dto.teamGame.projection;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamGameStatisticsDto {

    private Long teamId;

    private Long totalGames;

    private Long activeGames;

}
