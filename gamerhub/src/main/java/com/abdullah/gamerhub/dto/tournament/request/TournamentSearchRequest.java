package com.abdullah.gamerhub.dto.tournament.request;

import com.abdullah.gamerhub.entity.enums.TournamentStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentSearchRequest {

    private String keyword;

    private TournamentStatus status;

    private Long gameId;
}
