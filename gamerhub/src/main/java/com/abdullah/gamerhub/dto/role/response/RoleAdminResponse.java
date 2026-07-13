package com.abdullah.gamerhub.dto.role.response;

import com.abdullah.gamerhub.entity.enums.RoleName;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleAdminResponse {

    private Long id;

    private RoleName name;

    private String description;

    private long usersCount;
}
