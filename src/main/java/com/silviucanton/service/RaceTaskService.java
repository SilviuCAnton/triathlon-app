package com.silviucanton.service;

import com.silviucanton.domain.entities.RaceTask;

import java.util.List;
import java.util.Optional;

public interface RaceTaskService {
    RaceTask saveRaceTask(RaceTask raceTask);
    void removeRaceTask(RaceTask raceTask);
    Optional<RaceTask> findRaceTaskById(Integer raceTaskId);
    Long getNoRaces();
    List<RaceTask> findAllRaces();
}
