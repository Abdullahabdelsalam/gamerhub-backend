package com.abdullah.gamerhub.dto.championship.request;

import com.abdullah.gamerhub.entity.enums.ChampionshipStatus;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateChampionshipStatusRequest {

    @NotNull
    private ChampionshipStatus status;

}
