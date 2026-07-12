package com.abdullah.gamerhub.entity;

import com.abdullah.gamerhub.entity.enums.Provider;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "users",
        indexes = {
                @Index(name = "idx_username", columnList = "username"),
                @Index(name = "idx_email", columnList = "email")
        }
)
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class User extends BaseEntity {

    @NotBlank
    @Size(min = 3, max = 50)
    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @NotBlank
    @Email
    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotBlank
    @Column(nullable = false)
    @Size(min = 8 , max = 255)
    private String password;

    @Column(length = 100)
    private String displayName;

    @Column(length = 500)
    private String bio;

    @Column(length = 500)
    private String avatarUrl;

    @Column(length = 100)
    private String country;

    private LocalDate birthDate;

    @Pattern(
            regexp = "^\\+?[0-9]{8,15}$",
            message = "Invalid phone number"
    )
    @Column(length = 20)
    private  String phoneNumber;

    @Column(length = 100)
    private String coverImageUrl;

    @Column(length = 100)
    private String discordUsername;

    @Column(length = 100)
    private String steamId;

    @Column(length = 100)
    private String riotId;

    @Column(length = 100)
    private String epicGamesId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false , length = 30)
    private Provider provider;

    @Builder.Default
    @Column(nullable = false)
    private Boolean enabled = true;

    @Builder.Default
    @Column(nullable = false)
    private Boolean verified = false;


    //Roles
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "user_roles",

            joinColumns = @JoinColumn(name = "user_id"),

            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    @Builder.Default
    private Set<Role> roles = new HashSet<>();

    //Refresh Tokens
    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @Builder.Default
    private Set<RefreshToken> refreshTokens = new HashSet<>();


    //Team Memberships
    @OneToMany(
            mappedBy = "user",
            fetch = FetchType.LAZY
    )
    @Builder.Default
    private Set<TeamMember> teamMemberships = new HashSet<>();

    //Owned Teams
    @OneToMany(
            mappedBy = "owner",
            fetch = FetchType.LAZY
    )
    @Builder.Default
    private Set<Team> ownedTeams = new HashSet<>();

    //Tournament Player
    @OneToMany(
            mappedBy = "player",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Builder.Default
    private List<TournamentPlayer> tournamentRegistrations = new ArrayList<>();

    @OneToMany(mappedBy = "player")
    @Builder.Default
    private List<MatchParticipant> matches = new ArrayList<>();

}