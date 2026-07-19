package com.abdullah.gamerhub.dto.comment.response;

import com.abdullah.gamerhub.dto.user.response.UserSummaryResponse;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommentDetailsResponse {

    private Long id;

    private String content;

    private UserSummaryResponse author;

    private Long likesCount;

    private Boolean likedByCurrentUser;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
