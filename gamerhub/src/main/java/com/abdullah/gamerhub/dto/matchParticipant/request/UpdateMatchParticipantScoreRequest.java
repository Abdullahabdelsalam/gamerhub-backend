package com.abdullah.gamerhub.dto.matchParticipant.request;

import jakarta.validation.constraints.Min;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateMatchParticipantScoreRequest {

    @Min(0)
    private Integer score;

}
