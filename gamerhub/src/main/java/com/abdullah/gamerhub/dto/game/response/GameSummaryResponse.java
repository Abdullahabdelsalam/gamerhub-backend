package com.abdullah.gamerhub.dto.game.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GameSummaryResponse {
    private Long id;

    private String name;

    private String logoUrl;

}
