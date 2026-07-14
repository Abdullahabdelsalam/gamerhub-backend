package com.abdullah.gamerhub.dto.tournamentPlayer.request;

import jakarta.validation.constraints.Min;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateTournamentPlayerScoreRequest {
    @Min(0)
    private Integer score;

    @Min(1)
    private Integer rank;
}
