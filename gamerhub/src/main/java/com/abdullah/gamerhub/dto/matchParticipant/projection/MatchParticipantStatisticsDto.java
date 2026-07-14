package com.abdullah.gamerhub.dto.matchParticipant.projection;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchParticipantStatisticsDto {

    private Long matchId;

    private Long checkedInParticipants;

    private Long forfeitedParticipants;

}