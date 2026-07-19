package com.abdullah.gamerhub.dto.championship.response;

import com.abdullah.gamerhub.entity.enums.ChampionshipStatus;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChampionshipResponse {

    private Long id;

    private String title;

    private String description;

    private String bannerUrl;

    private String logoUrl;

    private String country;

    private LocalDate startDate;

    private LocalDate endDate;

    private ChampionshipStatus status;

}
