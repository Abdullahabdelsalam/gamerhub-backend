package com.abdullah.gamerhub.dto.post.request;

import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdatePostRequest {

    @Size(max = 3000)
    private String content;

    @Size(max = 500)
    private String imageUrl;

}
