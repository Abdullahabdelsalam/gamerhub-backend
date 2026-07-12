package com.abdullah.gamerhub.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "teams",
        indexes = {
                @Index(name = "idx_team_name", columnList = "name"),
                @Index(name = "idx_team_game", columnList = "game_id"),
                @Index(name = "idx_team_owner", columnList = "owner_id")
        },
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_team_name_game",
                        columnNames = {"name", "game_id"}
                )
        }
        )
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Team extends BaseEntity{

    @NotBlank
    @Size(min = 3 , max = 100)
    @Column(nullable = false, unique = true, length = 100)
    private String name;

    @Size(max = 500)
    @Column(length = 500)
    private String logoUrl;

    @Column(length = 1000)
    private String description;

    @Size(min = 1, max = 100)
    @Column(nullable = false)
    private Integer maxMembers;

    @Column(length = 500)
    private String discordInviteUrl;

    @Column(nullable = false)
    @Builder.Default
    private Boolean recruiting = true;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_team_owner") )
    private User owner;

    @OneToMany(
            mappedBy = "team",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @Builder.Default
    private Set<TeamMember> members = new HashSet<>();

    // game
    @OneToMany(
            mappedBy = "team",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<TeamGame> teamGames = new ArrayList<>();

    // Tournament Team
    @OneToMany(
            mappedBy = "team",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Builder.Default
    private List<TournamentTeam> tournamentRegistrations =
            new ArrayList<>();

    @OneToMany(mappedBy = "team")
    @Builder.Default
    private List<MatchParticipant> matches = new ArrayList<>();

}