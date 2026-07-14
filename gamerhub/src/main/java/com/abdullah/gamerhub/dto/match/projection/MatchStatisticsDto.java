package com.abdullah.gamerhub.dto.match.projection;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchStatisticsDto {

    private Long tournamentId;

    private Long totalMatches;

    private Long finishedMatches;

    private Long scheduledMatches;

    private Long liveMatches;

}
