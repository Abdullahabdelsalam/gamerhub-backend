package com.abdullah.gamerhub.entity;

import com.abdullah.gamerhub.entity.enums.ChampionshipStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "championships")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Championship extends BaseEntity{

    @Column(nullable = false, length = 150)
    private String name;

    @Column(length = 500)
    private String description;

    private String location;

    private LocalDate startDate;

    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private ChampionshipStatus status = ChampionshipStatus.UPCOMING;

    @OneToMany(
            mappedBy = "championship",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Builder.Default
    private List<Tournament> tournaments = new ArrayList<>();

}
