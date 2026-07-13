package com.abdullah.gamerhub.dto.user.projection;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserStatisticsDto {

    private Long posts;

    private Long followers;

    private Long following;

    private Long tournaments;

    private Long teams;

}
