package com.abdullah.gamerhub.dto.tournament.response;

import com.abdullah.gamerhub.dto.game.response.GameSummaryResponse;
import com.abdullah.gamerhub.entity.enums.TournamentStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TournamentDetailsResponse {

    private Long id;

    private String title;

    private String description;

    private TournamentStatus status;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private LocalDateTime registrationDeadline;

    private Integer maxParticipants;

    private BigDecimal prizePool;

    private GameSummaryResponse game;

    private Integer playersCount;

    private Integer teamsCount;

    private Integer matchesCount;
}
