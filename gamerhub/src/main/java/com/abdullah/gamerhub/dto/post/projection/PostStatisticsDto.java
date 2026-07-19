package com.abdullah.gamerhub.dto.post.projection;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostStatisticsDto {

    private Long totalPosts;

    private Long totalComments;

    private Long totalLikes;

}
