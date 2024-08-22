package com.movies.moviesottbackend.service;

import com.movies.moviesottbackend.api.dto.MoviesDTO;
import com.movies.moviesottbackend.persistence.entity.Movies;
import com.movies.moviesottbackend.persistence.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {

    private MoviesRepository moviesRepository;

    @Autowired
    public MoviesService(MoviesRepository moviesRepository){
        this.moviesRepository = moviesRepository;
    }

//    public List<MoviesDTO> getAllMovies(){
//        List<Movies> movies = moviesRepository.findAll();
//        List<MoviesDTO> moviesDTO = movies.stream().map(movie -> MoviesDTO.builder()
//                .movieid(movie.getMovieid())
//                .name(movie.getName())
//                .src(movie.getSrc())
//                .summary(movie.getSummary())
//                .build()).toList();
//        return moviesDTO;
//    }

    public List<Movies> getAllMovies(){
        return moviesRepository.findAll();
    }
}
