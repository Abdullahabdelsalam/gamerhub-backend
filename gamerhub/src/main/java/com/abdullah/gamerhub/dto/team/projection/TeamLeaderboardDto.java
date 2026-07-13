package com.abdullah.gamerhub.dto.team.projection;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamLeaderboardDto {

    private Long teamId;

    private String teamName;

    private Integer points;

    private Integer rank;
}
