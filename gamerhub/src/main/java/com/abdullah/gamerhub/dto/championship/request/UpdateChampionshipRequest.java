package com.abdullah.gamerhub.dto.championship.request;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateChampionshipRequest {

    private String title;

    private String description;

    private String bannerUrl;

    private String logoUrl;

    private String country;

    private LocalDate startDate;

    private LocalDate endDate;

}
