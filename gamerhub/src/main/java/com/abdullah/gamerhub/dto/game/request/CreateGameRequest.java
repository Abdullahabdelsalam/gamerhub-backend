package com.abdullah.gamerhub.dto.game.request;

import com.abdullah.gamerhub.entity.enums.Genre;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateGameRequest {

    @NotBlank
    @Size(max = 100)
    private String name;

    @NotBlank
    @Size(max = 1000)
    private String description;

    @NotNull
    private Genre genre;

    @Size(max = 500)
    private String website;

    @Size(max = 500)
    private String logoUrl;

    @Size(max = 500)
    private String coverImageUrl;
}
