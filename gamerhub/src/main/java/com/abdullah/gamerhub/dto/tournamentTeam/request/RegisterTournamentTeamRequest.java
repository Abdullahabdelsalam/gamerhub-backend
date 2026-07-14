package com.abdullah.gamerhub.dto.tournamentTeam.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterTournamentTeamRequest {

    @NotNull
    private Long teamId;

}
