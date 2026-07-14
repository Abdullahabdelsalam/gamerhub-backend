package com.abdullah.gamerhub.dto.matchParticipant.request;

import com.abdullah.gamerhub.entity.enums.MatchSide;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddPlayerToMatchRequest {

    @NotNull
    private Long tournamentPlayerId;

    @NotNull
    private MatchSide side;

}
