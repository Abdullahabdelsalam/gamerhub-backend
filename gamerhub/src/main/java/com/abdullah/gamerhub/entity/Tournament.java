package com.abdullah.gamerhub.entity;

import com.abdullah.gamerhub.entity.enums.TournamentStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;
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

    @Column(nullable = false)
    private LocalDateTime registrationDeadline;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    @Builder.Default
    private TournamentStatus status = TournamentStatus.UPCOMING;

    @NotNull
    @Min(2)
    private Integer maxParticipants;

    @NotNull
    @DecimalMin("0.00")
    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal prizePool;


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

    // championship
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "championship_id")
    private Championship championship;
}
