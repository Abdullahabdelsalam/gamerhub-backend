package com.abdullah.gamerhub.dto.championship.projection;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChampionshipStatisticsDto {

    private Long totalChampionships;

    private Long activeChampionships;

    private Long finishedChampionships;

    private Long upcomingChampionships;

}