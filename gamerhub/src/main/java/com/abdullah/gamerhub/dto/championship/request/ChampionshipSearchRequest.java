package com.abdullah.gamerhub.dto.championship.request;

import com.abdullah.gamerhub.entity.enums.ChampionshipStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChampionshipSearchRequest {

    private String keyword;

    private ChampionshipStatus status;

    private String country;

}
