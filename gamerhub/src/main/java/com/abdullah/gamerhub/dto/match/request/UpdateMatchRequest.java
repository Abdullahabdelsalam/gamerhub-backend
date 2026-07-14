package com.abdullah.gamerhub.dto.match.request;

import com.abdullah.gamerhub.entity.enums.MatchRound;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateMatchRequest {
    private String title;

    private MatchRound round;

    private Integer bestOf;

    private Integer matchNumber;
}
