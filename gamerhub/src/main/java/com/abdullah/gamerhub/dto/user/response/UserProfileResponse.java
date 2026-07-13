package com.abdullah.gamerhub.dto.user.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileResponse {
    private Long id;

    private String username;

    private String displayName;

    private String bio;

    private String avatarUrl;

    private String coverImageUrl;

    private String country;

    private String discordUsername;

    private String steamId;

    private String riotId;

    private String epicGamesId;

    private long followersCount;

    private long followingCount;

    private long postsCount;
}
