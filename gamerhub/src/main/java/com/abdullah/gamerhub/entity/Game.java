package com.abdullah.gamerhub.entity;

import com.abdullah.gamerhub.entity.enums.Genre;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "games",
        indexes = {
                @Index(name = "idx_game_name", columnList = "name")
        })
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Game extends BaseEntity{

    @NotBlank
    @Column(nullable = false, unique = true, length = 100)
    private String name;

    @NotBlank
    @Column(length = 1000)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private Genre genre;

    @Column(length = 500)
    private String imageUrl;

    // tournament relation
    @OneToMany(mappedBy = "game", fetch = FetchType.LAZY)
    @Builder.Default
    private Set<Tournament> tournaments = new HashSet<>();

    // Team Relation
    @OneToMany(
            mappedBy = "game",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<TeamGame> teamGames = new ArrayList<>();
}