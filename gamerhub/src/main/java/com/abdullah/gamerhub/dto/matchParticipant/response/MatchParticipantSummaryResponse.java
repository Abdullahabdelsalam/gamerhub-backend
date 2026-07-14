package com.abdullah.gamerhub.dto.matchParticipant.response;

import com.abdullah.gamerhub.entity.enums.MatchSide;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchParticipantSummaryResponse {

    private Long id;

    private MatchSide side;

}
