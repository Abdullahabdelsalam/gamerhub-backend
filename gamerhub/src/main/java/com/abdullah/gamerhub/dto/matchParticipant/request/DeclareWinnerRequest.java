package com.abdullah.gamerhub.dto.matchParticipant.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeclareWinnerRequest {

    @NotNull
    private Boolean winner;

}