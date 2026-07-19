package com.abdullah.gamerhub.dto.notification.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateNotificationRequest {

    private Boolean read;

}