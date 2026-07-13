package com.abdullah.gamerhub.dto.teamMember.projection;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamMemberStatisticsDto {
    private Long teamId;

    private Long acceptedMembers;

    private Long pendingMembers;
}
