package com.abdullah.gamerhub.dto.user.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserSummaryResponse {

    // used in comments followers likes team members
    private Long id;

    private String username;

    private String displayName;

    private String avatarUrl;
}
