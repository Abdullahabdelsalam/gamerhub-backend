package com.abdullah.gamerhub.dto.tournament.response;

import com.abdullah.gamerhub.entity.enums.TournamentStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentAdminResponse {

    private Long id;

    private String title;

    private TournamentStatus status;

    private Integer playersCount;

    private Integer teamsCount;

    private Integer matchesCount;
}
