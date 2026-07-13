package com.abdullah.gamerhub.dto.team.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateTeamRequest {
    @NotBlank
    @Size(min = 3, max = 100)
    private String name;

    @Size(max = 50)
    private String tag;

    @Size(max = 1000)
    private String description;

    private String logoUrl;

    private String bannerUrl;

    private String country;

    @Min(1)
    @Max(100)
    private Integer maxMembers;

    private String discordInviteUrl;

    private Set<Long> gameIds;
}
