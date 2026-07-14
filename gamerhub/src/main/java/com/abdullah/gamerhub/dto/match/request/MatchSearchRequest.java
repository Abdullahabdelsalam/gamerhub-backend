package com.abdullah.gamerhub.dto.match.request;

import com.abdullah.gamerhub.entity.enums.MatchRound;
import com.abdullah.gamerhub.entity.enums.MatchStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchSearchRequest {

    private MatchStatus status;

    private MatchRound round;

    private Long tournamentId;

}
