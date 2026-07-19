package com.abdullah.gamerhub.dto.post.projection;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPostStatisticsDto {

    private Long userId;

    private Long postsCount;

    private Long totalLikes;

}
