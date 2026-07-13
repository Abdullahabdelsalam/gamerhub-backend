package com.abdullah.gamerhub.dto.team.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamAdminResponse {
    private Long id;

    private String name;

    private Boolean verified;

    private Integer wins;

    private Integer losses;

    private Integer draws;

    private Integer membersCount;
}
