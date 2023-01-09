package com.example.Cinema.model;

import com.example.Cinema.objects.Seat;

import javax.persistence.*;

@Entity
public class CinemaRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cinema_room_ID")
    private Integer id;
    private Seat[][] seats;
}
