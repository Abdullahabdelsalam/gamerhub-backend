package com.abdullah.gamerhub.dto.team.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamCardResponse {

    private Long id;

    private String name;

    private String tag;

    private String logoUrl;

    private String country;

    private Boolean verified;

    private Integer wins;

    private Integer losses;
}
