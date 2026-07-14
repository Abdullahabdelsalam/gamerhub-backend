package com.abdullah.gamerhub.dto.tournamentPlayer.projection;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TournamentPlayerStatisticsDto {

    private Long tournamentId;

    private Long totalPlayers;

    private Long checkedInPlayers;

    private Long eliminatedPlayers;
}
