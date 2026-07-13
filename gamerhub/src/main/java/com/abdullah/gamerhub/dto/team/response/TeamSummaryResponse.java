package com.abdullah.gamerhub.dto.team.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamSummaryResponse {
    private Long id;

    private String name;

    private String tag;

    private String logoUrl;
}
