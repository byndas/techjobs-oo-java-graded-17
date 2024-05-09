package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency {

    private int id;
    private static int nextId = 1;
    private String value;

    ////////////////////////////////////////////////////////////////////////////
    public CoreCompetency() {
        this.id = nextId;
        nextId++;
    }

    public CoreCompetency(String value) {
        this();
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
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency skill = (CoreCompetency) o;
        return id == skill.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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
