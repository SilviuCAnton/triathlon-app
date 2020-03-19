package com.silviucanton.domain.validator;

import com.silviucanton.domain.entities.Race;
import com.silviucanton.domain.exceptions.ValidateException;
import org.springframework.stereotype.Component;

@Component
public class RaceValidator implements Validator<Integer, Race> {
    @Override
    public void validate(Race race) throws ValidateException {

    }
}
