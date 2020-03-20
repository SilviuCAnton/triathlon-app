package com.silviucanton.service;

import com.silviucanton.domain.entities.Athlete;
import com.silviucanton.domain.exceptions.ValidateException;
import com.silviucanton.domain.validator.Validator;
import com.silviucanton.repo.AthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AthleteServiceImpl implements AthleteService {

    private AthleteRepository athleteRepository;
    private Validator<Integer, Athlete> validator;

    @Autowired
    public AthleteServiceImpl(AthleteRepository athleteRepository, @Qualifier(value = "athleteValidator") Validator<Integer, Athlete> validator) {
        this.athleteRepository = athleteRepository;
        this.validator = validator;
    }

    public AthleteRepository getAthleteRepository() {
        return athleteRepository;
    }

    public void setAthleteRepository(AthleteRepository athleteRepository) {
        this.athleteRepository = athleteRepository;
    }

    public Validator<Integer, Athlete> getValidator() {
        return validator;
    }

    public void setValidator(Validator<Integer, Athlete> validator) {
        this.validator = validator;
    }

    @Override
    @Transactional
    public Athlete saveAthlete(Athlete athlete) throws ValidateException {
        validator.validate(athlete);
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
