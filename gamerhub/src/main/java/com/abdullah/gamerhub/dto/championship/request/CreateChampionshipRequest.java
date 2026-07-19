package com.abdullah.gamerhub.dto.championship.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateChampionshipRequest {

    @NotBlank
    @Size(max = 150)
    private String title;

    @Size(max = 500)
    private String description;

    @Size(max = 500)
    private String bannerUrl;

    @Size(max = 500)
    private String logoUrl;

    @Size(max = 100)
    private String country;

    @NotNull
    private LocalDate startDate;

    @NotNull
    private LocalDate endDate;

}
