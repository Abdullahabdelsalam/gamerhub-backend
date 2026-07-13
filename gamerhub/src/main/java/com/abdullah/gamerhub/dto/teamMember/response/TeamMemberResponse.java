package com.abdullah.gamerhub.dto.teamMember.response;

import com.abdullah.gamerhub.dto.team.response.TeamSummaryResponse;
import com.abdullah.gamerhub.dto.user.response.UserSummaryResponse;
import com.abdullah.gamerhub.entity.enums.TeamMemberStatus;
import com.abdullah.gamerhub.entity.enums.TeamRole;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamMemberResponse {

    private Long id;

    private UserSummaryResponse user;

    private TeamSummaryResponse team;

    private TeamRole role;

    private TeamMemberStatus status;
}
