package com.abdullah.gamerhub.dto.role.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssignRoleToUsersRequest {
    @NotEmpty
    private Set<Long> userIds;
}
