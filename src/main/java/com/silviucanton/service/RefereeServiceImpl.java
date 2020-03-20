package com.silviucanton.service;

import com.silviucanton.domain.entities.Referee;
import com.silviucanton.domain.exceptions.ValidateException;
import com.silviucanton.domain.validator.RefereeValidator;
import com.silviucanton.domain.validator.Validator;
import com.silviucanton.repo.RefereeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RefereeServiceImpl implements RefereeService {

    private RefereeRepository refereeRepository;
    private Validator<Integer, Referee> validator;

    public RefereeServiceImpl(RefereeRepository refereeRepository, Validator<Integer, Referee> validator) {
        this.refereeRepository = refereeRepository;
        this.validator = validator;
    }

    public RefereeRepository getRefereeRepository() {
        return refereeRepository;
    }

    @Autowired
    public void setRefereeRepository(RefereeRepository refereeRepository) {
        this.refereeRepository = refereeRepository;
    }

    public Validator<Integer, Referee> getValidator() {
        return validator;
    }

    @Autowired
    public void setValidator(@Qualifier(value = "refereeValidator") Validator<Integer, Referee> validator) {
        this.validator = validator;
    }

    @Override
    @Transactional
    public Referee saveReferee(Referee referee) throws ValidateException {
        validator.validate(referee);
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
