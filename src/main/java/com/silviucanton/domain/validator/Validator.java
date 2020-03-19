package com.silviucanton.domain.validator;

import com.silviucanton.domain.entities.Entity;
import com.silviucanton.domain.exceptions.ValidateException;

public interface Validator<ID, T extends Entity<ID>> {
    void validate(T entity) throws ValidateException;
}
