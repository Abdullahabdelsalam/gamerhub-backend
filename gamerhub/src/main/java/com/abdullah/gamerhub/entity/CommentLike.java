package com.abdullah.gamerhub.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "comment_likes",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_comment_like_user",
                        columnNames = {"user_id", "comment_id"}
                )
        },
        indexes = {
                @Index(name = "idx_comment_like_user", columnList = "user_id"),
                @Index(name = "idx_comment_like_comment", columnList = "comment_id")
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommentLike extends BaseEntity {

    //user
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "user_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_comment_like_user")
    )
    private User user;

    // Liked Comment
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "comment_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_comment_like_comment")
    )
    private Comment comment;
}
