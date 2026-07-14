package com.abdullah.gamerhub.dto.match.request;

import com.abdullah.gamerhub.entity.enums.MatchStatus;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateMatchStatusRequest {

    @NotNull
    private MatchStatus status;
}
