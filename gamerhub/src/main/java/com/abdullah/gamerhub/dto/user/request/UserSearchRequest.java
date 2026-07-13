package com.abdullah.gamerhub.dto.user.request;

import com.abdullah.gamerhub.dto.PageRequestDto;
import com.abdullah.gamerhub.entity.enums.UserSortField;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSearchRequest extends PageRequestDto {
    @Size(max = 50, message = "Search username query too long")
    private String username;

    @Size(max = 150, message = "Search email query too long")
    private String email;

    private Boolean enabled;

    private Boolean verified;

    @Size(max = 100, message = "Search country query too long")
    private String country;

    private UserSortField sortBy = UserSortField.USERNAME;
}
