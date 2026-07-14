package com.abdullah.gamerhub.dto.match.response;

import com.abdullah.gamerhub.entity.enums.MatchStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchAdminResponse {
    private Long id;

    private MatchStatus status;

    private Integer participantsCount;
}
