package com.abdullah.gamerhub.dto.team.response;

import com.abdullah.gamerhub.dto.user.response.UserSummaryResponse;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamResponse {

    private Long id;

    private String name;

    private String tag;

    private String description;

    private String logoUrl;

    private String bannerUrl;

    private String country;

    private Integer maxMembers;

    private Boolean verified;

    private Integer wins;

    private Integer losses;

    private Integer draws;

    private String discordInviteUrl;

    private UserSummaryResponse owner;
}
