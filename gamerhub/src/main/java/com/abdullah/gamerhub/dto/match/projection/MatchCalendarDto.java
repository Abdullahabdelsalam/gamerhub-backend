package com.abdullah.gamerhub.dto.match.projection;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchCalendarDto {

    private Long matchId;

    private String title;

    private LocalDateTime scheduledAt;

}
