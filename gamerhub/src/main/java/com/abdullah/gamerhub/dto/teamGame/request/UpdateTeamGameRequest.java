package com.abdullah.gamerhub.dto.teamGame.request;

import com.abdullah.gamerhub.entity.enums.GameDivision;
import com.abdullah.gamerhub.entity.enums.GameRank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateTeamGameRequest {

    private GameRank rank;

    private GameDivision division;

    private Boolean active;

}