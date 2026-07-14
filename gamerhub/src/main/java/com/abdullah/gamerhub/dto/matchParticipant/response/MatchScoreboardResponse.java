package com.abdullah.gamerhub.dto.matchParticipant.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchScoreboardResponse {

    private MatchParticipantSummaryResponse leftParticipant;

    private MatchParticipantSummaryResponse rightParticipant;

}