package com.abdullah.gamerhub.dto.team.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InviteMemberRequest {

    @NotNull
    private Long userId;
}
