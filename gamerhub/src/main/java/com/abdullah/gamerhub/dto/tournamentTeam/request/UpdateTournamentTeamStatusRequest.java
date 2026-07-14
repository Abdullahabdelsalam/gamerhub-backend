package com.abdullah.gamerhub.dto.tournamentTeam.request;

import com.abdullah.gamerhub.entity.enums.TournamentRegistrationStatus;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateTournamentTeamStatusRequest {

    @NotNull
    private TournamentRegistrationStatus status;
}
