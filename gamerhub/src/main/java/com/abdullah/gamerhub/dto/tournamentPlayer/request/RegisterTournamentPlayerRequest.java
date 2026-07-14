package com.abdullah.gamerhub.dto.tournamentPlayer.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterTournamentPlayerRequest {
    @NotNull
    private Long playerId;
}
