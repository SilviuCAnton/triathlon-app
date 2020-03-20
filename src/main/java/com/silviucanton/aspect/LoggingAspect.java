package com.silviucanton.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private final Logger logger = LogManager.getLogger(getClass());

    // Validator logging

    @Pointcut("execution(public void com.silviucanton.domain.validator.*.validate(*))")
    private void forValidators(){}

    @Before("forValidators()")
    public void beforeValidating(JoinPoint joinPoint) {
        logger.info("Validating entity " + joinPoint.getArgs()[0].toString() + " ...");
    }

    @AfterReturning("forValidators()")
    public void afterSuccessfulValidation(JoinPoint joinPoint) {
        logger.info("Entity " + joinPoint.getArgs()[0].toString() + " has been validated successfully!");
    }

    @AfterThrowing("forValidators()")
    public void afterUnsuccessfulValidation(JoinPoint joinPoint) {
        logger.error("Entity " + joinPoint.getArgs()[0].toString() + " was not valid!");
    }

    //Repository logging

    @Pointcut("execution(public * com.silviucanton.repo.*.save(*))")
    private void forRepositorySave(){}

    @Pointcut("execution(public * com.silviucanton.repo.*.delete(*))")
    private void forRepositoryDelete(){}

    @Pointcut("execution(public * com.silviucanton.repo.*.findById(*))")
    private void forRepositoryFind(){}

    @Pointcut("execution(public * com.silviucanton.repo.*.findAll(*))")
    private void forRepositoryFindAll(){}

    @Pointcut("execution(public * com.silviucanton.repo.*.count(*))")
    private void forRepositoryCount(){}

    @Before("forRepositorySave()")
    public void beforeRepoSaving(JoinPoint joinPoint) {
        logger.info(joinPoint.getSignature().toShortString() + " : Saving entity " + joinPoint.getArgs()[0] + " ...");
    }

    @AfterReturning("forRepositorySave()")
    public void afterRepoSuccessfulSave(JoinPoint joinPoint) {
        logger.info(joinPoint.getSignature().toShortString() + " : Entity " + joinPoint.getArgs()[0].toString() + " has been saved successfully!");
    }

    @AfterThrowing(value = "forRepositorySave()", throwing = "throwable")
    public void afterUnsuccessfulSave(JoinPoint joinPoint, Throwable throwable) {
        logger.error(joinPoint.getSignature().toShortString() + " : Entity " + joinPoint.getArgs()[0].toString() + " failed to save! : " + throwable.getMessage());
    }

    @Before("forRepositoryDelete()")
    public void beforeRepoDelete(JoinPoint joinPoint) {
        logger.info(joinPoint.getSignature().toShortString() + " : Deleting entity " + joinPoint.getArgs()[0] + " ...");
    }

    @After("forRepositoryDelete()")
    public void afterRepoDelete(JoinPoint joinPoint) {
        logger.info(joinPoint.getSignature().toShortString() + " : Entity " + joinPoint.getArgs()[0].toString() + " has been deleted.");
    }

    @Before("forRepositoryFind()")
    public void beforeRepoFind(JoinPoint joinPoint){
        logger.info(joinPoint.getSignature().toShortString() + " : Searching entity " + joinPoint.getArgs()[0] + " ...");
    }

    @Before("forRepositoryFindAll()")
    public void beforeRepoFindAll(JoinPoint joinPoint){
        logger.info(joinPoint.getSignature().toShortString() +  " : Returning all entities");
    }

    @Before("forRepositoryCount()")
    public void beforeRepoCount(JoinPoint joinPoint){
        logger.info(joinPoint.getSignature().toShortString() + " : Returning repo count");
    }


}
