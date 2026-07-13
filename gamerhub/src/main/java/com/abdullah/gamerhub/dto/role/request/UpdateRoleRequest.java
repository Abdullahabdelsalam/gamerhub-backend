package com.abdullah.gamerhub.dto.role.request;

import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateRoleRequest {
    @Size(max = 300)
    private String description;
}
