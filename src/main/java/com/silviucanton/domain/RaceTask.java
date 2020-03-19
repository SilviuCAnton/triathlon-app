package com.silviucanton.domain;

import javax.persistence.*;
import java.util.Objects;

@javax.persistence.Entity
@Table(name = "RaceTasks")
public class RaceTask implements Entity<Integer> {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "taskName")
    private String taskName;

    @Column(name = "maxPoints")
    private Float maxPoints;

    public RaceTask() {}

    public RaceTask(String taskName, Float maxPoints) {
        this(null, taskName, maxPoints);
    }

    public RaceTask(Integer id, String taskName, Float maxPoints) {
        this.id = id;
        this.taskName = taskName;
        this.maxPoints = maxPoints;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Float getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(Float maxPoints) {
        this.maxPoints = maxPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RaceTask raceTask = (RaceTask) o;
        return Objects.equals(id, raceTask.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "RaceTask{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", maxPoints=" + maxPoints +
                '}';
    }
}
