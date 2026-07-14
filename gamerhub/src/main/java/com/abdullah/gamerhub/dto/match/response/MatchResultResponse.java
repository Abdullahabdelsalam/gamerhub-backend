package com.abdullah.gamerhub.dto.match.response;

import com.abdullah.gamerhub.entity.enums.MatchStatus;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchResultResponse {

    private Long id;

//    private MatchParticipantSummaryResponse winner;

    private MatchStatus status;

    private LocalDateTime finishedAt;

}
