package com.abdullah.gamerhub.dto.post.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostFeedRequest {

    private int page;

    private int size;

}
