package com.abdullah.gamerhub.dto.tournament.request;

import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateTournamentRequest {
    @NotBlank
    @Size(max = 150)
    private String title;

    @Size(max = 2000)
    private String description;

    @NotNull
    private LocalDateTime startDate;

    @NotNull
    private LocalDateTime endDate;

    @NotNull
    private LocalDateTime registrationDeadline;

    @NotNull
    @Min(2)
    private Integer maxParticipants;

    @NotNull
    @DecimalMin("0.00")
    private BigDecimal prizePool;

    @NotNull
    private Long gameId;

    private Long championshipId;
}
