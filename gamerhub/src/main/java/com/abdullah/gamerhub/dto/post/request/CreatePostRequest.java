package com.abdullah.gamerhub.dto.post.request;

import com.abdullah.gamerhub.entity.enums.PostVisibility;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreatePostRequest {

    @NotBlank
    @Size(max = 3000)
    private String content;

    @Size(max = 500)
    private String imageUrl;

    @NotNull
    private PostVisibility visibility;

}
