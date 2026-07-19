package com.abdullah.gamerhub.dto.notification.response;

import com.abdullah.gamerhub.entity.enums.NotificationType;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationDetailsResponse {

    private Long id;

    private NotificationType type;

    private String title;

    private String message;

    private Boolean read;

    private String actionUrl;

    private LocalDateTime createdAt;

}
