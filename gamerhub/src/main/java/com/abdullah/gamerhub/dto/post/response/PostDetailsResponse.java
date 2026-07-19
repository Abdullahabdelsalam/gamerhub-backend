package com.abdullah.gamerhub.dto.post.response;

import com.abdullah.gamerhub.dto.user.response.UserSummaryResponse;
import com.abdullah.gamerhub.entity.enums.PostVisibility;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostDetailsResponse {

    private Long id;

    private String content;

    private String imageUrl;

    private PostVisibility visibility;

    private UserSummaryResponse author;

    private Long likesCount;

    private Long commentsCount;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
