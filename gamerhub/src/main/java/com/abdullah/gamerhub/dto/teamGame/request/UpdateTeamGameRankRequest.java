package com.abdullah.gamerhub.dto.teamGame.request;

import com.abdullah.gamerhub.entity.enums.GameDivision;
import com.abdullah.gamerhub.entity.enums.GameRank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateTeamGameRankRequest {

    @NotNull
    private GameRank rank;

    private GameDivision division;

}