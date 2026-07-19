package com.abdullah.gamerhub.dto.post.request;

import com.abdullah.gamerhub.entity.enums.PostVisibility;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostSearchRequest {

    private String keyword;

    private Long userId;

    private PostVisibility visibility;

}
