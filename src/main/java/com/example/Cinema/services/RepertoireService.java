package com.example.Cinema.services;

import com.example.Cinema.repositories.RepertoireRepository;
import org.springframework.stereotype.Service;

@Service
public class RepertoireService {

    private final RepertoireRepository repertoireRepository;

    public RepertoireService(RepertoireRepository repertoireRepository) {
        this.repertoireRepository = repertoireRepository;
    }
}
