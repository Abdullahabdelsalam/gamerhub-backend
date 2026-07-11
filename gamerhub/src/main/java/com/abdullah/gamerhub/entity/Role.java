package com.abdullah.gamerhub.entity;

import com.abdullah.gamerhub.entity.enums.RoleName;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "roles",
    indexes = {
        @Index(name = "idx_role_name" ,columnList = "name")
    }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role extends BaseEntity{

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private RoleName name;

    @Column(length = 300)
    private  String description;

    @ManyToMany(mappedBy = "roles",
            fetch = FetchType.LAZY
    )
    @Builder.Default
    private Set<User> users = new HashSet<>();
}
