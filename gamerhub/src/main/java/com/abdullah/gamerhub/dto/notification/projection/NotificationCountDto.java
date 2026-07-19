package com.abdullah.gamerhub.dto.notification.projection;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationCountDto {

    private Long unreadCount;

}
