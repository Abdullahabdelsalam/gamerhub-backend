package com.abdullah.gamerhub.dto.game.request;

import com.abdullah.gamerhub.entity.enums.Genre;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateGameRequest {
    @Size(max = 100)
    private String name;

    @Size(max = 1000)
    private String description;

    private Genre genre;

    private String website;

    private String logoUrl;

    private String coverImageUrl;
}
