package com.silviucanton.domain;

import java.util.Objects;

public class Athlete {

    private Integer id, raceNumber, score;
    private String firstName, lastName;

    public Athlete(Integer raceNumber, Integer score, String firstName, String lastName) {
        this(null, raceNumber, score, firstName, lastName);
    }

    public Athlete(Integer id, Integer raceNumber, Integer score, String firstName, String lastName) {
        this.id = id;
        this.raceNumber = raceNumber;
        this.score = score;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRaceNumber() {
        return raceNumber;
    }

    public void setRaceNumber(Integer raceNumber) {
        this.raceNumber = raceNumber;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Athlete athlete = (Athlete) o;
        return Objects.equals(id, athlete.id) &&
                Objects.equals(raceNumber, athlete.raceNumber) &&
                Objects.equals(score, athlete.score) &&
                Objects.equals(firstName, athlete.firstName) &&
                Objects.equals(lastName, athlete.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, raceNumber, score, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "id=" + id +
                ", raceNumber=" + raceNumber +
                ", score=" + score +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
