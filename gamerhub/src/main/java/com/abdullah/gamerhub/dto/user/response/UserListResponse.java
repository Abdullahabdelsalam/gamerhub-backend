package com.abdullah.gamerhub.dto.user.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserListResponse {
    private Long id;

    private String username;

    private String displayName;

    private String avatarUrl;

    private Boolean verified;
}
