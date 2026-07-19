package com.abdullah.gamerhub.dto.post.projection;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrendingPostDto {

    private Long postId;

    private String content;

    private Long likesCount;

    private Long commentsCount;

}