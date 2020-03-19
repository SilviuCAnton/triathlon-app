package com.silviucanton.service;

import com.silviucanton.domain.entities.RaceTask;
import com.silviucanton.domain.exceptions.ValidateException;

import java.util.List;
import java.util.Optional;

public interface RaceTaskService {
    RaceTask saveRaceTask(RaceTask raceTask) throws ValidateException;
    void removeRaceTask(RaceTask raceTask);
    Optional<RaceTask> findRaceTaskById(Integer raceTaskId);
    Long getNoRaces();
    List<RaceTask> findAllRaces();
}
