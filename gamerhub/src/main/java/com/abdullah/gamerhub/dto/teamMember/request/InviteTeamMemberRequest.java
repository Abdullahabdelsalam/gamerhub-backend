package com.abdullah.gamerhub.dto.teamMember.request;

import com.abdullah.gamerhub.entity.enums.TeamRole;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InviteTeamMemberRequest {

    @NotNull
    private Long userId;

    @NotNull
    private TeamRole role;
}
