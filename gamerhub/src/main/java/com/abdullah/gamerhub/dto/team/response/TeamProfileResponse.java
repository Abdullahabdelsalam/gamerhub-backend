package com.abdullah.gamerhub.dto.team.response;

import com.abdullah.gamerhub.dto.user.response.UserSummaryResponse;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamProfileResponse {

    private Long id;

    private String name;

    private String tag;

    private String description;

    private String logoUrl;

    private String bannerUrl;

    private String country;

    private Boolean verified;

    private Integer wins;

    private Integer losses;

    private Integer draws;

    private Integer maxMembers;

    private UserSummaryResponse owner;

    private Integer membersCount;

    private Integer gamesCount;

    private Integer tournamentsCount;
}
