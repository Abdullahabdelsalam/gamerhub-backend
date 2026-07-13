package com.abdullah.gamerhub.dto.team.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateTeamGamesRequest {

    @NotEmpty
    private Set<Long> gameIds;
}
