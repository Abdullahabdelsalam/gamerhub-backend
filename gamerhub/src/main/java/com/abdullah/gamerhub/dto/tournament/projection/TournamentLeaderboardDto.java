package com.abdullah.gamerhub.dto.tournament.projection;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TournamentLeaderboardDto {

    private Long tournamentId;

    private String title;

    private Integer registrations;
}
