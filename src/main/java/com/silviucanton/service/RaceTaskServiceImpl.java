package com.silviucanton.service;

import com.silviucanton.domain.entities.RaceTask;
import com.silviucanton.domain.exceptions.ValidateException;
import com.silviucanton.domain.validator.Validator;
import com.silviucanton.repo.RaceTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RaceTaskServiceImpl implements RaceTaskService {

    private RaceTaskRepository raceTaskRepository;
    private Validator<Integer, RaceTask> validator;

    public RaceTaskServiceImpl(RaceTaskRepository raceTaskRepository, Validator<Integer, RaceTask> validator) {
        this.raceTaskRepository = raceTaskRepository;
        this.validator = validator;
    }

    public RaceTaskRepository getRaceTaskRepository() {
        return raceTaskRepository;
    }

    @Autowired
    public void setRaceTaskRepository(RaceTaskRepository raceTaskRepository) {
        this.raceTaskRepository = raceTaskRepository;
    }

    public Validator<Integer, RaceTask> getValidator() {
        return validator;
    }

    @Autowired
    public void setValidator(@Qualifier(value = "raceTaskValidator") Validator<Integer, RaceTask> validator) {
        this.validator = validator;
    }

    @Override
    public RaceTask saveRaceTask(RaceTask raceTask) throws ValidateException {
        validator.validate(raceTask);
        return raceTaskRepository.save(raceTask);
    }

    @Override
    public void removeRaceTask(RaceTask raceTask) {
        raceTaskRepository.delete(raceTask);
    }

    @Override
    public Optional<RaceTask> findRaceTaskById(Integer raceTaskId) {
        return raceTaskRepository.findById(raceTaskId);
    }

    @Override
    public Long getNoRaces() {
        return raceTaskRepository.count();
    }

    @Override
    public List<RaceTask> findAllRaces() {
        return raceTaskRepository.findAll();
    }
}
