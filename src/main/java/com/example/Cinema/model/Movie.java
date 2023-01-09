package com.example.Cinema.model;

import com.example.Cinema.enums.MovieCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movies")
public class Movie {

    //TODO zmienic typy na prymitywne + nazwać odpowiednio zmieną duration, premier

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String genre;
    private Integer duration;
    @NotNull
    private String description;
    @NotNull
    private Integer minimumAge;
    @NotNull
    private Double rating;
    @NotNull
    private Boolean isPremiere;
    @Enumerated(EnumType.ORDINAL)
    private MovieCategory movieCategory;

    
}
