package com.silviucanton.domain.validator;

import com.silviucanton.domain.entities.RaceTask;
import com.silviucanton.domain.exceptions.ValidateException;
import org.springframework.stereotype.Component;

@Component
public class RaceTaskValidator implements Validator<Integer, RaceTask> {
    @Override
    public void validate(RaceTask raceTask) throws ValidateException {

    }
}
