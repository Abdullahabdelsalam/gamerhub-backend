package com.abdullah.gamerhub.dto.post.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostSummaryResponse {

    private Long id;

    private String content;

}
