package com.abdullah.gamerhub.dto.matchParticipant.response;

import com.abdullah.gamerhub.entity.enums.MatchSide;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchParticipantProfileResponse {

    private Long id;

    private MatchSide side;

    private Integer score;

    private Boolean checkedIn;

    private Boolean winner;

    private Boolean forfeited;

}