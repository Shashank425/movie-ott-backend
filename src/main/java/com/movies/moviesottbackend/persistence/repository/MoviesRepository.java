package com.movies.moviesottbackend.persistence.repository;

import com.movies.moviesottbackend.persistence.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Long> {

}
