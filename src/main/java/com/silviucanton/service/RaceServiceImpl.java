package com.silviucanton.service;

import com.silviucanton.domain.entities.Race;
import com.silviucanton.domain.exceptions.ValidateException;
import com.silviucanton.domain.validator.Validator;
import com.silviucanton.repo.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RaceServiceImpl implements RaceService {

    private RaceRepository raceRepository;
    private Validator<Integer, Race> validator;

    @Autowired
    public RaceServiceImpl(RaceRepository raceRepository, @Qualifier(value = "raceValidator") Validator<Integer, Race> validator) {
        this.raceRepository = raceRepository;
        this.validator = validator;
    }

    public RaceRepository getRaceRepository() {
        return raceRepository;
    }

    public void setRaceRepository(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    public Validator<Integer, Race> getValidator() {
        return validator;
    }

    public void setValidator(Validator<Integer, Race> validator) {
        this.validator = validator;
    }

    @Override
    @Transactional
    public Race saveRace(Race race) throws ValidateException {
        validator.validate(race);
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
