package com.abdullah.gamerhub.dto.tournamentTeam.projection;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentTeamStatisticsDto {

    private Long tournamentId;

    private Long totalTeams;

    private Long checkedInTeams;

    private Long eliminatedTeams;
}
