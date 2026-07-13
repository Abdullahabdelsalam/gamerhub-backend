package com.abdullah.gamerhub.dto.tournament.response;

import com.abdullah.gamerhub.dto.game.response.GameSummaryResponse;
import com.abdullah.gamerhub.entity.enums.TournamentStatus;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentCardResponse {

    private Long id;

    private String title;

    private TournamentStatus status;

    private LocalDateTime startDate;

    private BigDecimal prizePool;

    private GameSummaryResponse game;
}
