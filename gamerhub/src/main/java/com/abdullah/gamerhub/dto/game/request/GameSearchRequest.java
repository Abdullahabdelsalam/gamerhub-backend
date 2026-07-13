package com.abdullah.gamerhub.dto.game.request;

import com.abdullah.gamerhub.entity.enums.Genre;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GameSearchRequest {
    private String keyword;

    private Genre genre;
}
