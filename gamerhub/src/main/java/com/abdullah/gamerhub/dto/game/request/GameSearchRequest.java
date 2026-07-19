package com.abdullah.gamerhub.dto.game.request;

import com.abdullah.gamerhub.dto.PageRequestDto;
import com.abdullah.gamerhub.entity.enums.Genre;
import lombok.*;
import org.springframework.data.domain.PageRequest;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GameSearchRequest {

    private String keyword;

    private Genre genre;
}
