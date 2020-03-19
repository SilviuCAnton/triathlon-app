package com.silviucanton.service;

import com.silviucanton.domain.entities.Race;
import com.silviucanton.repo.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RaceServiceImpl implements RaceService {

    private RaceRepository raceRepository;

    @Autowired
    public RaceServiceImpl(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    public RaceRepository getRaceRepository() {
        return raceRepository;
    }

    public void setRaceRepository(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    @Override
    public Race saveRace(Race race) {
        return raceRepository.save(race);
    }

    @Override
    public void removeRace(Race race) {
        raceRepository.delete(race);
    }

    @Override
    public Optional<Race> findRaceById(Integer raceId) {
        return raceRepository.findById(raceId);
    }

    @Override
    public Long getNoRaces() {
        return raceRepository.count();
    }

    @Override
    public List<Race> findAllRaces() {
        return raceRepository.findAll();
    }
}
