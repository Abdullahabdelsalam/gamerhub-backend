package com.abdullah.gamerhub.entity;

import com.abdullah.gamerhub.entity.enums.Provider;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "users")
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
    @Size(min = 8)
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

    private  String phoneNumber;

    private String coverImageUrl;

    private String discordUsername;

    private String steamId;

    private String riotId;

    private String epicGamesId;

    @Enumerated(EnumType.STRING)
    private Provider provider;

    @Builder.Default
    private Boolean enabled = true;

    @Builder.Default
    private Boolean verified = false;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "user_roles",

            joinColumns = @JoinColumn(name = "user_id"),

            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    @Builder.Default
    private Set<Role> roles = new HashSet<>();

    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @Builder.Default
    private Set<RefreshToken> refreshTokens = new HashSet<>();



//    ManyToMany
//            Role ok
//
//    OneToOne
//            RefreshToken
//
//    OneToMany
//            Posts
//
//    OneToMany
//            Comments
//
//    OneToMany
//            Likes
//
//    OneToMany
//            Notifications
//
//    OneToMany
//    Owned Teams
//
//    OneToMany
//    Team Memberships
//
//    OneToMany
//    Tournament Participations
//
//    OneToMany
//            Followers
//
//    OneToMany
//            Following
}
