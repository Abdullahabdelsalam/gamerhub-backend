package com.abdullah.gamerhub.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "follows",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_follower_following",
                        columnNames = {
                                "follower_id",
                                "following_id"
                        }
                )
        },
        indexes = {
                @Index(name = "idx_follow_follower", columnList = "follower_id"),
                @Index(name = "idx_follow_following", columnList = "following_id")
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Follow extends BaseEntity {

    //User who follows someone
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "follower_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_follow_follower")
    )
    private User follower;

    //User being followed
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "following_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_follow_following")
    )
    private User following;
}
