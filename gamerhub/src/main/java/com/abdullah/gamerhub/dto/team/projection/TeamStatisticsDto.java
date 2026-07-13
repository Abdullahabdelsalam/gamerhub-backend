package com.abdullah.gamerhub.dto.team.projection;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamStatisticsDto {
    private Long teamId;

    private String teamName;

    private Long membersCount;

    private Long wins;

    private Long losses;

}
