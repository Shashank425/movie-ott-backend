package com.movies.moviesottbackend.api.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Builder
@Data
public class MoviesDTO {
    private Long movieid;
    private String name;
    private String src;
    private String summary;
}
