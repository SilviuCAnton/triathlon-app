package com.silviucanton.service;

import com.silviucanton.domain.entities.Athlete;
import com.silviucanton.repo.AthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AthleteServiceImpl implements AthleteService {

    private AthleteRepository athleteRepository;

    @Autowired
    public AthleteServiceImpl(AthleteRepository athleteRepository) {
        this.athleteRepository = athleteRepository;
    }

    public AthleteRepository getAthleteRepository() {
        return athleteRepository;
    }

    public void setAthleteRepository(AthleteRepository athleteRepository) {
        this.athleteRepository = athleteRepository;
    }

    @Override
    public Athlete saveAthlete(Athlete athlete) {
        return athleteRepository.save(athlete);
    }

    @Override
    public void removeAthlete(Athlete athlete) {
        athleteRepository.delete(athlete);
    }

    @Override
    public Optional<Athlete> findAthleteById(Integer athleteId) {
        return athleteRepository.findById(athleteId);
    }

    @Override
    public Long getNoAthletes() {
        return athleteRepository.count();
    }

    @Override
    public List<Athlete> findAllAthletes() {
        return athleteRepository.findAll();
    }
}
