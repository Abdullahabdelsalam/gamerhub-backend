package com.abdullah.gamerhub.dto.team.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateTeamRequest {

    private String name;

    private String tag;

    private String description;

    private String logoUrl;

    private String bannerUrl;

    private String country;

    private Integer maxMembers;

    private String discordInviteUrl;
}
