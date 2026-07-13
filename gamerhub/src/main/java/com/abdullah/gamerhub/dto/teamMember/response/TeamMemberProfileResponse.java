package com.abdullah.gamerhub.dto.teamMember.response;

import com.abdullah.gamerhub.dto.user.response.UserSummaryResponse;
import com.abdullah.gamerhub.entity.User;
import com.abdullah.gamerhub.entity.enums.TeamMemberStatus;
import com.abdullah.gamerhub.entity.enums.TeamRole;

import java.time.LocalDateTime;

public class TeamMemberProfileResponse {

    private Long id;

    private UserSummaryResponse user;

    private TeamRole role;

    private TeamMemberStatus status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private User createdBy;
    private User updatedBy;
}
