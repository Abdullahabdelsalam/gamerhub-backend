package com.abdullah.gamerhub.dto.championship.projection;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChampionshipCalendarDto {

    private Long id;

    private String title;

    private LocalDate startDate;

    private LocalDate endDate;

}
