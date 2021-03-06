package com.silviucanton.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@javax.persistence.Entity
@Table(name = "Athletes")
public class Athlete implements Entity<Integer> {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "raceNumber")
    private Integer raceNumber;

    @Column(name = "score")
    private Float score;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    public Athlete() {}

    public Athlete(Integer raceNumber, Float score, String firstName, String lastName) {
        this(null, raceNumber, score, firstName, lastName);
    }

    public Athlete(Integer id, Integer raceNumber, Float score, String firstName, String lastName) {
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

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
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
                Objects.equals(raceNumber, athlete.raceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, raceNumber);
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
