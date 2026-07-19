package com.abdullah.gamerhub.dto.teamGame.projection;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamGameLeaderboardDto {

    private Long teamId;

    private String teamName;

    private Integer rankingPoints;

}
