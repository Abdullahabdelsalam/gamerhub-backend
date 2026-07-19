package com.abdullah.gamerhub.dto.comment.projection;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TopCommentDto {

    private Long id;

    private String content;

    private Long likesCount;

}
