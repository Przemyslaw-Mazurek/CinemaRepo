package com.example.Cinema.services;

import com.example.Cinema.repositories.ShowingRepository;
import org.springframework.stereotype.Service;

@Service
public class ShowingService {

    private final ShowingRepository showingRepository;

    public ShowingService(ShowingRepository showingRepository) {
        this.showingRepository = showingRepository;
    }
}
