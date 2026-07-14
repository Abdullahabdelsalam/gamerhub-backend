package com.abdullah.gamerhub.dto.match.response;

import com.abdullah.gamerhub.entity.enums.MatchRound;
import com.abdullah.gamerhub.entity.enums.MatchStatus;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchCardResponse {
    private Long id;

    private String title;

    private MatchRound round;

    private MatchStatus status;

    private LocalDateTime scheduledAt;
}
