package com.silviucanton.domain;

import java.util.Objects;

public class Referee implements Entity<Integer> {

    private Integer id;

    private String username;

    private String passwordHash;

    private String firstName;

    private String lastName;

    public Referee(String username, String passwordHash, String firstName, String lastName) {
        this(null, username, passwordHash, firstName, lastName);
    }

    public Referee(Integer id, String username, String passwordHash, String firstName, String lastName) {
        this.id = id;
        this.username = username;
        this.passwordHash = passwordHash;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
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
        Referee referee = (Referee) o;
        return Objects.equals(id, referee.id) &&
                Objects.equals(username, referee.username) &&
                Objects.equals(passwordHash, referee.passwordHash) &&
                Objects.equals(firstName, referee.firstName) &&
                Objects.equals(lastName, referee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, passwordHash, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Referee{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
