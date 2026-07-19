package com.abdullah.gamerhub.dto.post.request;

import com.abdullah.gamerhub.entity.enums.PostVisibility;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdatePostVisibilityRequest {

    @NotNull
    private PostVisibility visibility;

}
