package com.silviucanton.service;

import com.silviucanton.domain.entities.Race;

import java.util.List;
import java.util.Optional;

public interface RaceService {
    Race saveRace(Race race);
    void removeRace(Race race);
    Optional<Race> findRaceById(Integer raceId);
    Long getNoRaces();
    List<Race> findAllRaces();
}
