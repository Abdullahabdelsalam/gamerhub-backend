package com.abdullah.gamerhub.dto.user.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssignRolesRequest {

    @NotEmpty(message = "Role IDs set cannot be empty. At least one role must be assigned.")
    private Set<Long> roleIds;
}
