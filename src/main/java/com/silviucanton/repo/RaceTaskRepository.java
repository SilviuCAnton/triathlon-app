package com.silviucanton.repo;

import com.silviucanton.domain.entities.RaceTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceTaskRepository extends JpaRepository<RaceTask, Integer> {
}
