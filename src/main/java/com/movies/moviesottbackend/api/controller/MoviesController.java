package com.movies.moviesottbackend.api.controller;

import com.movies.moviesottbackend.persistence.entity.Movies;
import com.movies.moviesottbackend.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
@CrossOrigin
public class MoviesController {
    private MoviesService moviesService;

    @Autowired
    public MoviesController(MoviesService moviesService){
        this.moviesService = moviesService;
    }

    @GetMapping
    public List<Movies> getAllMovies(){
        return moviesService.getAllMovies();
    }
}
