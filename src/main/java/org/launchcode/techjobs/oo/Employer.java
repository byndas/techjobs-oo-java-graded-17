package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer {

    private int id;
    private static int nextId = 1;
    private String value;

    ////////////////////////////////////////////////////////////////////////////
    public Employer() {
        id = nextId;
        nextId++;
    }

    public Employer(String value) {
        this(); // makes initializing id default behavior
        this.value = value;
    }

    ////////////////////////////////////////////////////////////////////////////
    // custom toString(), equals(), hashCode() methods:
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        // objects are equal if share same id
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    ////////////////////////////////////////////////////////////////////////////
    // getters & setters:
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
