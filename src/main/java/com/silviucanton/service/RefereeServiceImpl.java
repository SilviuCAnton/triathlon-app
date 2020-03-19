package com.silviucanton.service;

import com.silviucanton.domain.entities.Referee;
import com.silviucanton.repo.RefereeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RefereeServiceImpl implements RefereeService {

    private RefereeRepository refereeRepository;

    public RefereeServiceImpl(RefereeRepository refereeRepository) {
        this.refereeRepository = refereeRepository;
    }

    public RefereeRepository getRefereeRepository() {
        return refereeRepository;
    }

    @Autowired
    public void setRefereeRepository(RefereeRepository refereeRepository) {
        this.refereeRepository = refereeRepository;
    }

    @Override
    public Referee saveReferee(Referee referee) {
        return refereeRepository.save(referee);
    }

    @Override
    public void removeReferee(Referee referee) {
        refereeRepository.delete(referee);
    }

    @Override
    public Optional<Referee> findRefereeById(Integer refereeId) {
        return refereeRepository.findById(refereeId);
    }

    @Override
    public Long getNoReferees() {
        return refereeRepository.count();
    }

    @Override
    public List<Referee> findAllReferees() {
        return refereeRepository.findAll();
    }
}
