package com.silviucanton.repo;

import com.silviucanton.domain.entities.Referee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefereeRepository extends JpaRepository<Referee, Integer> {
}
