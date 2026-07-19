package com.abdullah.gamerhub.dto.notification.request;

import com.abdullah.gamerhub.entity.enums.NotificationType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationSearchRequest {

    private NotificationType type;

    private Boolean read;

}