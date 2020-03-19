package com.silviucanton.service;

import com.silviucanton.domain.entities.RaceTask;
import com.silviucanton.repo.RaceTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RaceTaskServiceImpl implements RaceTaskService {

    private RaceTaskRepository raceTaskRepository;

    public RaceTaskServiceImpl(RaceTaskRepository raceTaskRepository) {
        this.raceTaskRepository = raceTaskRepository;
    }

    public RaceTaskRepository getRaceTaskRepository() {
        return raceTaskRepository;
    }

    @Autowired
    public void setRaceTaskRepository(RaceTaskRepository raceTaskRepository) {
        this.raceTaskRepository = raceTaskRepository;
    }

    @Override
    public RaceTask saveRaceTask(RaceTask raceTask) {
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
