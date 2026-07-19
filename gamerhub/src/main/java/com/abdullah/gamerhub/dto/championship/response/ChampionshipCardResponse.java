package com.abdullah.gamerhub.dto.championship.response;

import com.abdullah.gamerhub.entity.enums.ChampionshipStatus;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChampionshipCardResponse {

    private Long id;

    private String title;

    private String bannerUrl;

    private ChampionshipStatus status;

    private LocalDate startDate;

}
