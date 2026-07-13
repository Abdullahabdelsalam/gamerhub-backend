package com.abdullah.gamerhub.dto.team.request;

import com.abdullah.gamerhub.dto.PageRequestDto;

public class TeamSearchRequest extends PageRequestDto {
    private String keyword;

    private String country;

    private Boolean verified;

    private Long gameId;
}
