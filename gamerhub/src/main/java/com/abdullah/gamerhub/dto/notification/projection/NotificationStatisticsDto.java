package com.abdullah.gamerhub.dto.notification.projection;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationStatisticsDto {

    private Long totalNotifications;

    private Long unreadNotifications;

}
