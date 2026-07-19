package com.abdullah.gamerhub.dto.comment.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommentAdminResponse {

    private Long id;

    private String content;

    private String username;

    private Long likesCount;

}