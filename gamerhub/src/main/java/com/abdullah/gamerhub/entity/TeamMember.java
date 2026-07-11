package com.abdullah.gamerhub.entity;

import com.abdullah.gamerhub.entity.enums.TeamMemberStatus;
import com.abdullah.gamerhub.entity.enums.TeamRole;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "team_members",
        indexes = {
                @Index(name = "idx_tm_user", columnList = "user_id"),
                @Index(name = "idx_tm_team", columnList = "team_id"),
                @Index(name = "idx_tm_status", columnList = "status")
        },
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_team_member",
                        columnNames = {
                                "user_id",
                                "team_id"
                        }
                )
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamMember extends BaseEntity{
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TeamRole role;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TeamMemberStatus status;

    @Column(nullable = false)
    private LocalDateTime joinedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_team_member_user")
    )
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_team_member_team")
    )
    private Team team;
}
