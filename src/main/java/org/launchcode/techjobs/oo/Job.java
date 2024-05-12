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

    ////////////////////////////////////////////////////////////////////////////
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(
        String name,
        Employer employer,
        Location location,
        PositionType positionType,
        CoreCompetency coreCompetency
    ) {
        this(); // calls first constructor to initialize id by default
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    ////////////////////////////////////////////////////////////////////////////
    @Override
    public boolean equals(Object o) {
        // objects sharing same id are equal
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public String toString() {

        String dna = "Data not available";

        String strName = name;
        String strEmployer = employer.toString();
        String strLocation =  location.toString();
        String strPositionType = positionType.toString();
        String strCoreCompetency = coreCompetency.toString();

        if (strName.isEmpty()) { strName = dna; }
        if (strEmployer.isEmpty()) { strEmployer = dna; }
        if (strLocation.isEmpty()) { strLocation = dna; }
        if (strPositionType.isEmpty()) { strPositionType = dna; }
        if (strCoreCompetency.isEmpty()) { strCoreCompetency = dna; }

        return
            System.lineSeparator() +
            "ID: "+ id + System.lineSeparator() +
            "Name: "+ strName + System.lineSeparator() +
            "Employer: "+ strEmployer + System.lineSeparator() +
            "Location: "+ strLocation + System.lineSeparator() +
            "Position Type: "+ strPositionType + System.lineSeparator() +
            "Core Competency: "+ strCoreCompetency +
            System.lineSeparator();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    ////////////////////////////////////////////////////////////////////////////
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }
    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
