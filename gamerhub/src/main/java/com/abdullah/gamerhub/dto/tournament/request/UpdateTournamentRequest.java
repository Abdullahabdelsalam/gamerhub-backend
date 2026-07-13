package com.abdullah.gamerhub.dto.tournament.request;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateTournamentRequest {

    private String title;

    private String description;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private LocalDateTime registrationDeadline;

    private Integer maxParticipants;

    private BigDecimal prizePool;
}
