package com.abdullah.gamerhub.dto.post.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostFeedResponse {

    private List<PostCardResponse> posts;

    private Integer currentPage;

    private Integer totalPages;

    private Long totalElements;

}
