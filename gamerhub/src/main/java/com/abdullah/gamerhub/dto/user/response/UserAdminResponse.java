package com.abdullah.gamerhub.dto.user.response;

import com.abdullah.gamerhub.entity.enums.Provider;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAdminResponse {
    private Long id;

    private String username;

    private String email;

    private Boolean enabled;

    private Boolean verified;

    private Provider provider;

    private Set<String> roles;

    private LocalDate createdAt;
}
