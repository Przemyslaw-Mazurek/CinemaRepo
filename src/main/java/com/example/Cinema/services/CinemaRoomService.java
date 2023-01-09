package com.example.Cinema.services;

import com.example.Cinema.repositories.CinemaRoomRepository;
import org.springframework.stereotype.Service;

@Service
public class CinemaRoomService {

    private final CinemaRoomRepository cinemaRoomRepository;

    public CinemaRoomService(CinemaRoomRepository cinemaRoomRepository) {
        this.cinemaRoomRepository = cinemaRoomRepository;
    }
}
