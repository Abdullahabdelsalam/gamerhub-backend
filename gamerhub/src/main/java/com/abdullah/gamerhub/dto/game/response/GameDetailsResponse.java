package com.abdullah.gamerhub.dto.game.response;

import com.abdullah.gamerhub.entity.enums.Genre;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GameDetailsResponse {
    private Long id;

    private String name;

    private String description;

    private Genre genre;

    private String website;

    private String logoUrl;

    private String coverImageUrl;

    private long tournamentsCount;

    private long teamsCount;
}
