package com.abdullah.gamerhub.dto.tournamentPlayer.request;

import com.abdullah.gamerhub.entity.enums.TournamentRegistrationStatus;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateTournamentPlayerStatusRequest {
    @NotNull
    private TournamentRegistrationStatus status;
}
