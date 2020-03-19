package com.silviucanton.service;

import com.silviucanton.domain.entities.Athlete;

import java.util.List;
import java.util.Optional;

public interface AthleteService {
    Athlete saveAthlete(Athlete athlete);
    void removeAthlete(Athlete athlete);
    Optional<Athlete> findAthleteById(Integer athleteId);
    Long getNoAthletes();
    List<Athlete> findAllAthletes();

}
