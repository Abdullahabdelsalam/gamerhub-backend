package com.abdullah.gamerhub.dto.role.request;

import com.abdullah.gamerhub.entity.enums.RoleName;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateRoleRequest {

    @NotNull
    private RoleName name;

    @Size(max = 300)
    private String description;
}
