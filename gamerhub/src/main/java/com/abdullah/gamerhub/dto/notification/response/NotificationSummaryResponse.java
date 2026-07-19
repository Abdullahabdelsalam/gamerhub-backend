package com.abdullah.gamerhub.dto.notification.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationSummaryResponse {

    private Long id;

    private String title;

    private Boolean read;

}