package com.abdullah.gamerhub.entity;

import com.abdullah.gamerhub.entity.enums.PostVisibility;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(
        name = "posts",
        indexes = {
                @Index(name = "idx_post_user", columnList = "user_id"),
                @Index(name = "idx_post_created_at", columnList = "created_at")
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post extends BaseEntity {

    @Size(max = 3000)
    @Column(length = 3000)
    private String content;

    @Column(length = 500)
    private String imageUrl;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Builder.Default
    private PostVisibility visibility = PostVisibility.PUBLIC;

    //Author
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "user_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_post_user")
    )
    private User user;

    //Comments
    @OneToMany(
            mappedBy = "post",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @Builder.Default
    private Set<Comment> comments = new HashSet<>();

     // PostLike
    @OneToMany(
            mappedBy = "post",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @Builder.Default
    private Set<PostLike> likes = new HashSet<>();
}
