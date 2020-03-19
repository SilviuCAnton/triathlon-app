package com.silviucanton.service;

import com.silviucanton.domain.entities.Race;
import com.silviucanton.domain.exceptions.ValidateException;

import java.util.List;
import java.util.Optional;

public interface RaceService {
    Race saveRace(Race race) throws ValidateException;
    void removeRace(Race race);
    Optional<Race> findRaceById(Integer raceId);
    Long getNoRaces();
    List<Race> findAllRaces();
}
