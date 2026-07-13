package com.abdullah.gamerhub.dto.tournament.projection;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TournamentStatisticsDto {

    private Long tournamentId;

    private String title;

    private Long playersCount;

    private Long teamsCount;

    private Long matchesCount;
}
