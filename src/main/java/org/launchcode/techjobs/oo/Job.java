package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // add two constructors:
    //      first initializes unique ID
    //      second initializes other five fields
    //          & calls first to initialize 'id' field

    // add custom equals() & hashCode() methods
    // two Job objects "equal" that share id

    // add getters for each field EXCEPT nextId
    // add setters for each field EXCEPT nextID & id
}
