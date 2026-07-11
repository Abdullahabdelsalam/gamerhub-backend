package com.abdullah.gamerhub.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "refresh_tokens",
        indexes = {
                @Index(name = "idx_refresh_token", columnList = "token"),
                @Index(name = "idx_refresh_expiry", columnList = "expiryDate")
        }
)
public class RefreshToken extends BaseEntity {


    @NotBlank
    @Column(nullable = false, unique = true, length = 500)
    private String  token;

    @Column(nullable = false)
    private LocalDateTime expiryDate;

    @Builder.Default
    @Column(nullable = false)
    private Boolean revoked = false;

    private LocalDateTime revokedAt;

    @Column(length = 255)
    private String deviceName;

    @Column(length = 100)
    private String ipAddress;

    @Column(length = 255)
    private String userAgent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false ,
            foreignKey = @ForeignKey(name = "fk_refresh_token_user")
    )
    private User user;

}
