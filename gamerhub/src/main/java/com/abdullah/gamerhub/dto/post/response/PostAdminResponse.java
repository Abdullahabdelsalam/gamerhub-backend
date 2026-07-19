package com.abdullah.gamerhub.dto.post.response;

import com.abdullah.gamerhub.entity.enums.PostVisibility;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostAdminResponse {

    private Long id;

    private String content;

    private String username;

    private PostVisibility visibility;

    private Long likesCount;

    private Long commentsCount;

}
