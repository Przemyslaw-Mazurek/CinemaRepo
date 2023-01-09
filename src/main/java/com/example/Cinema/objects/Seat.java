package com.example.Cinema.objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seat {

    //TODO do modelu
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int row;
    private int seatNumber;
    private int cinemaRoomNumber;

    public Seat(int row, int seatNumber) {
        this.row = row;
        this.seatNumber = seatNumber;
    }
}
