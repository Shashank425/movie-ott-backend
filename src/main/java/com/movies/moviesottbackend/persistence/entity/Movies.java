package com.movies.moviesottbackend.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "movies")
@Data
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long movieid;

    @Column(name = "name")
    private String name;

    @Column(name = "src")
    private String src;

    @Column(name = "summary", columnDefinition = "TEXT")
    private String summary;

    @Column(name = "genre")
    private String genre;

    @Column(name = "language")
    private String language;

    @Column(name = "rating")
    private int rating;
}
