package com.silviucanton.domain.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@javax.persistence.Entity
@Table(name = "Races")
public class Race implements Entity<Integer> {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "raceName")
    private String raceName;

    @OneToMany
    @JoinColumn(name = "raceId")
    private List<RaceTask> tasks;

    public Race() {
        this.id = null;
        this.raceName = "DefaultName";
        this.tasks = new ArrayList<>();
    }

    public Race(String raceName, List<RaceTask> tasks) {
        this(null, raceName, tasks);
    }

    public Race(Integer id, String raceName, List<RaceTask> tasks) {
        this.id = id;
        this.tasks = tasks;
        this.raceName = raceName;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<RaceTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<RaceTask> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return Objects.equals(id, race.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Race{" +
                "id=" + id +
                ", tasks=" + tasks +
                '}';
    }
}
