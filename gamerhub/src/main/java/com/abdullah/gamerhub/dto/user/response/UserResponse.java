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
public class UserResponse {

    private Long id;

    private String username;

    private String email;

    private String displayName;

    private String bio;

    private String avatarUrl;

    private String country;

    private LocalDate birthDate;

    private String phoneNumber;

    private Boolean enabled;

    private Boolean verified;

    private Provider provider;

    private Set<String> roles;

}
