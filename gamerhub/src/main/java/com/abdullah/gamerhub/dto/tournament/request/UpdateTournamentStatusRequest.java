package com.abdullah.gamerhub.dto.tournament.request;

import com.abdullah.gamerhub.entity.enums.TournamentStatus;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateTournamentStatusRequest {

    @NotNull
    private TournamentStatus status;
}
