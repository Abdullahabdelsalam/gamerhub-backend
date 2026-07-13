package com.abdullah.gamerhub.dto;

import com.abdullah.gamerhub.entity.enums.SortDirection;
import com.abdullah.gamerhub.entity.enums.UserSortField;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PageRequestDto {
    @Min(0)
    private int page = 0;

    @Min(1)
    @Max(100)
    private int size = 20;

    private SortDirection sortDirection = SortDirection.DESC;
}
