package com.abdullah.gamerhub.entity;

import com.abdullah.gamerhub.entity.enums.Provider;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class User extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Provider provider;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "user_roles",

            joinColumns = @JoinColumn(name = "user_id"),

            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    @Builder.Default
    private Set<Role> roles = new HashSet<>();
}
