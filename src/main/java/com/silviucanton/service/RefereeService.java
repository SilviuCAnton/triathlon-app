package com.silviucanton.service;

import com.silviucanton.domain.entities.Referee;
import com.silviucanton.domain.exceptions.ValidateException;

import java.util.List;
import java.util.Optional;

public interface RefereeService {
    Referee saveReferee(Referee referee) throws ValidateException;
    void removeReferee(Referee referee);
    Optional<Referee> findRefereeById(Integer refereeId);
    Long getNoReferees();
    List<Referee> findAllReferees();
}
