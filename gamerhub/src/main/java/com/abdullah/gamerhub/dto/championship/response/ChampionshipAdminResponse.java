package com.abdullah.gamerhub.dto.championship.response;

import com.abdullah.gamerhub.entity.enums.ChampionshipStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChampionshipAdminResponse {

    private Long id;

    private String title;

    private ChampionshipStatus status;

    private Integer tournamentsCount;

}
