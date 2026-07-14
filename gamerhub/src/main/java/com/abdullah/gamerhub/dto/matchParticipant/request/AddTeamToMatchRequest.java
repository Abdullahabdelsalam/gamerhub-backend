package com.abdullah.gamerhub.dto.matchParticipant.request;

import com.abdullah.gamerhub.entity.enums.MatchSide;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddTeamToMatchRequest {

    @NotNull
    private Long tournamentTeamId;

    @NotNull
    private MatchSide side;

}
