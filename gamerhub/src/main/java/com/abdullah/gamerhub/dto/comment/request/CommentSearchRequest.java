package com.abdullah.gamerhub.dto.comment.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommentSearchRequest {

    private Long userId;

    private Long postId;

    private String keyword;

}
