package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
// fields, constructors, getters/setters, custom methods ALL FOUR classes share
	private int id;
	private static int nextId = 1;
	private String value;

	public JobField(String value) {
		this.value = value;
		id = nextId;
		nextId++;
	}
	////////////////////////////////////////////////////////////////////////////
	@Override
	public int hashCode() { return Objects.hash(getId()); }

	@Override
	public String toString() { return value; }

	@Override // job1.equals(job2)
	public boolean equals(Object obj) {
		// this refers to job1 & obj refers to job2
		if (this == obj) { return true; }
		if (!(obj instanceof JobField)) { return false; }
		// casting Object obj to JobField type
		JobField jobVar = (JobField) obj;
		// equivalent objects have same id
		return id == jobVar.id;
	}
	////////////////////////////////////////////////////////////////////////////
	public int getId() { return id; }

	public String getValue() { return value; }
	public void setValue(String value) { this.value = value; }
}
