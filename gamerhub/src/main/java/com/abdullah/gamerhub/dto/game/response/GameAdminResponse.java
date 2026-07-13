package com.abdullah.gamerhub.dto.game.response;

import com.abdullah.gamerhub.entity.enums.Genre;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GameAdminResponse {
    private Long id;

    private String name;

    private Genre genre;

    private long tournamentsCount;

    private long teamsCount;
}
