package com.abdullah.gamerhub.dto.teamGame.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddGameToTeamRequest {

    @NotNull
    private Long gameId;

}
