package com.silviucanton;

import com.silviucanton.domain.entities.Athlete;
import com.silviucanton.domain.exceptions.ValidateException;
import com.silviucanton.service.AthleteService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AthleteService athleteService = (AthleteService) context.getBean("athleteServiceImpl");
        Athlete athlete = new Athlete(22, 0f, "Silviu", "Anton");
        try {
            athleteService.saveAthlete(athlete);
        } catch (ValidateException e) {
            e.printStackTrace();
        }
        System.out.println(athleteService.findAllAthletes());
        System.out.println(athleteService.getNoAthletes());
        athleteService.removeAthlete(athlete);
        System.out.println(athleteService.getNoAthletes());
    }

}
