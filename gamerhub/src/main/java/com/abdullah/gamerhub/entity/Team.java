package com.abdullah.gamerhub.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.URL;

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

    @Column(length = 50)
    private String tag;

    @Column(length = 1000)
    private String description;

    @Size(max = 500)
    @Column(length = 500)
    private String logoUrl;

    @Size(max = 500)
    @Column(length = 500)
    private String bannerUrl;

    @Size(max = 500)
    @Column(length = 500)
    private String country;

    @Min(1)
    @Max(100)
    @Column(nullable = false)
    private Integer maxMembers;

    @Column(nullable = false)
    @Builder.Default
    private boolean verified= false;

    @Min(0)
    @Builder.Default
    private Integer wins = 0;

    @Min(0)
    @Builder.Default
    private Integer losses = 0;

    @Min(0)
    @Builder.Default
    private Integer draws = 0;

    @Column(length = 500)
    @URL
    private String discordInviteUrl;

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
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @Builder.Default
    private List<TeamGame> teamGames = new ArrayList<>();

    // Tournament Team
    @OneToMany(
            mappedBy = "team",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @Builder.Default
    private List<TournamentTeam> tournamentRegistrations =
            new ArrayList<>();

    @OneToMany(mappedBy = "team",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @Builder.Default
    private List<MatchParticipant> matchParticipant = new ArrayList<>();

    //======== Helper Methods
    public void addMember(TeamMember member) {

        members.add(member);

        member.setTeam(this);

    }

    public void removeMember(TeamMember member) {

        members.remove(member);

        member.setTeam(null);

    }

    public void addGame(TeamGame teamGame) {

        teamGames.add(teamGame);

        teamGame.setTeam(this);

    }

    public void removeGame(TeamGame teamGame) {

        teamGames.remove(teamGame);

        teamGame.setTeam(null);

    }

    public void addTournamentRegistration(TournamentTeam registration) {

        tournamentRegistrations.add(registration);

        registration.setTeam(this);

    }
    public void removeTournamentRegistration(TournamentTeam registration) {

        tournamentRegistrations.remove(registration);

        registration.setTeam(null);

    }
//    public void addMatchParticipant(MatchParticipant participant) {
//
//        matches.add(participant);
//
//        participant.setTeam(this);
//
//    }
//    public void removeMatchParticipant(MatchParticipant participant) {
//
//        matches.remove(participant);
//
//        participant.setTeam(null);
//
//    }

}