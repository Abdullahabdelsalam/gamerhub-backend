package com.abdullah.gamerhub.dto.comment.projection;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommentStatisticsDto {

    private Long totalComments;

    private Long totalLikes;

}
