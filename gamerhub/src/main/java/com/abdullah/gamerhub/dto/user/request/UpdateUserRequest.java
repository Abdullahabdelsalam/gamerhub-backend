package com.abdullah.gamerhub.dto.user.request;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateUserRequest {

    @Size(max = 100, message = "Display name cannot exceed 100 characters")
    private String displayName;

    @Size(max = 500, message = "Bio cannot exceed 500 characters")
    private String bio;

    @Size(max = 500, message = "Avatar URL cannot exceed 500 characters")
    private String avatarUrl;

    @Size(max = 100, message = "Cover image URL cannot exceed 100 characters")
    private String coverImageUrl;

    @Size(max = 100, message = "Country cannot exceed 100 characters")
    private String country;

    @Past(message = "Birth date must be in the past")
    private LocalDate birthDate;

    @Pattern(regexp = "^\\+?[0-9]{8,15}$", message = "Invalid phone number format")
    private String phoneNumber;

    // Gaming Platform Identity Extensions
    @Size(max = 100, message = "Discord username cannot exceed 100 characters")
    private String discordUsername;

    @Size(max = 100, message = "Steam ID cannot exceed 100 characters")
    private String steamId;

    @Size(max = 100, message = "Riot ID cannot exceed 100 characters")
    private String riotId;

    @Size(max = 100, message = "Epic Games ID cannot exceed 100 characters")
    private String epicGamesId;

    private Boolean enabled;

    private Boolean verified;
}
