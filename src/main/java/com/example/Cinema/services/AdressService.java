package com.example.Cinema.services;

import com.example.Cinema.repositories.AdressRepository;
import org.springframework.stereotype.Service;

@Service
public class AdressService {

    private final AdressRepository adressRepository;

    public AdressService(AdressRepository adressRepository) {
        this.adressRepository = adressRepository;
    }
}
