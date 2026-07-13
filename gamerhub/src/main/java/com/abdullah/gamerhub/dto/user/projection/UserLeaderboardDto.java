package com.abdullah.gamerhub.dto.user.projection;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLeaderboardDto {
    private Long userId;

    private String username;

    private Integer score;

}
