package com.abdullah.gamerhub.dto.match.request;

import com.abdullah.gamerhub.entity.enums.MatchRound;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateMatchRequest {
    @Size(max = 100)
    private String title;

    @NotNull
    private MatchRound round;

    @NotNull
    @Min(1)
    @Max(9)
    private Integer bestOf;

    @NotNull
    private Long tournamentId;

    private Integer matchNumber;

}
