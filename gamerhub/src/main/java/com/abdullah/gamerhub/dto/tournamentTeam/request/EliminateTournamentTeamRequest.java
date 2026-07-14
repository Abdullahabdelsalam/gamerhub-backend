package com.abdullah.gamerhub.dto.tournamentTeam.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EliminateTournamentTeamRequest {
    @NotNull
    private Boolean eliminated;
}
