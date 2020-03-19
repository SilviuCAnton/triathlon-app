package com.silviucanton.domain.validator;

import com.silviucanton.domain.entities.Referee;
import com.silviucanton.domain.exceptions.ValidateException;
import org.springframework.stereotype.Component;

@Component
public class RefereeValidator implements Validator<Integer, Referee> {
    @Override
    public void validate(Referee referee) throws ValidateException {

    }
}
