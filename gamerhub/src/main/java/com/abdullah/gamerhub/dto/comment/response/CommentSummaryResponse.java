package com.abdullah.gamerhub.dto.comment.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommentSummaryResponse {

    private Long id;

    private String content;

}