package com.silviucanton.domain.validator;

import com.silviucanton.domain.entities.Athlete;
import com.silviucanton.domain.exceptions.ValidateException;
import org.springframework.stereotype.Component;

@Component
public class AthleteValidator implements Validator<Integer, Athlete> {
    @Override
    public void validate(Athlete athlete) throws ValidateException {

    }
}
