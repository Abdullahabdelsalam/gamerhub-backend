package com.abdullah.gamerhub.dto.match.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScheduleMatchRequest {

    @NotNull
    private LocalDateTime scheduledAt;
}
