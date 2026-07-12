package com.abdullah.gamerhub.entity;

import com.abdullah.gamerhub.entity.enums.TournamentStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tournaments",
        indexes = {
                @Index(name = "idx_tournament_title", columnList = "title"),
                @Index(name = "idx_tournament_status", columnList = "status"),
                @Index(name = "idx_tournament_start", columnList = "startDate")
        }
        )
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tournament extends BaseEntity{

    @NotBlank
    @Size(max = 150)
    @Column(nullable = false, length = 150)
    private String title;

    @Size(max = 2000)
    @Column(length = 2000)
    private String description;

    @Column(nullable = false)
    private LocalDateTime startDate;

    @Column(nullable = false)
    private LocalDateTime endDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private TournamentStatus status;

    @Column(nullable = false)
    private Integer maxPlayers;

    @Column(nullable = false)
    private Double prizePool;


    // game relation
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "game_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_tournament_game")
    )
    private Game game;

    //Match
    @OneToMany(
            mappedBy = "tournament",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Builder.Default
    private List<Match> matches = new ArrayList<>();

    //Tournament Player
    @OneToMany(
            mappedBy = "tournament",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Builder.Default
    private List<TournamentPlayer> players = new ArrayList<>();

    // TournamentTeam
    @OneToMany(
            mappedBy = "tournament",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Builder.Default
    private List<TournamentTeam> teams = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "championship_id")
    private Championship championship;
}
