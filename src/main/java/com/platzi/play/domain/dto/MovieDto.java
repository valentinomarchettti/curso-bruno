package com.platzi.play.domain.dto;

import java.time.LocalDate;

public record MovieDto(
        String title,
        Integer duracion,
        String genero,
        LocalDate releaseDate,
        Double rating
) {

}
