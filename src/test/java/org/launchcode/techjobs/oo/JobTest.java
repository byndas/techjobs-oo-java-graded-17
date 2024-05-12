package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {

	@Test
	public void testSettingJobId() {
		Job job1 = new Job();
		Job job2 = new Job();
		assertNotEquals(job1.getId(), job2.getId());
	}

	@Test
	public void testJobConstructorSetsAllFields() {

		Job job = new Job(
				"Product tester",
				new Employer("ACME"),
				new Location("Desert"),
				new PositionType("Quality control"),
				new CoreCompetency("Persistence")
		);

//	tests that Job second constructor assigns class & value to each field
		assertEquals(job.getName(), "Product tester");
		assertTrue(job.getEmployer() instanceof Employer);
		assertEquals(job.getEmployer().getValue(), "ACME");
		assertTrue(job.getLocation() instanceof Location);
		assertEquals(job.getLocation().getValue(), "Desert");
		assertTrue(job.getPositionType() instanceof PositionType);
		assertEquals(job.getPositionType().getValue(), "Quality control");
		assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
		assertEquals(job.getCoreCompetency().getValue(), "Persistence");
	}

	@Test
	public void testJobsForEquality() {
		/*
		generate two Job objects with same field values EXCEPT id
		test that .equals() returns false
		don't test if two jobs share same ID
		*/
		Job job1 = new Job(
				"Product tester",
				new Employer("ACME"),
				new Location("Desert"),
				new PositionType("Quality control"),
				new CoreCompetency("Persistence")
		);

		Job job2 = new Job(
				"Product tester",
				new Employer("ACME"),
				new Location("Desert"),
				new PositionType("Quality control"),
				new CoreCompetency("Persistence")
		);

//	assertNotEquals(job1, job2);
		assertFalse(job1.equals(job2));
	}

	@Test
	public void testToStringStartsAndEndsWithNewLine() {

		Job job = new Job(
				"Product tester",
				new Employer("ACME"),
				new Location("Desert"),
				new PositionType("Quality control"),
				new CoreCompetency("Persistence")
		);
		assertTrue(job.toString().startsWith(System.lineSeparator()));
		assertTrue(job.toString().endsWith(System.lineSeparator()));
	}

	@Test
	public void testToStringContainsCorrectLabelsAndData() {

		Job job = new Job(
				"Product tester",
				new Employer("ACME"),
				new Location("Desert"),
				new PositionType("Quality control"),
				new CoreCompetency("Persistence")
		);

		assertEquals(
				job.toString(),
				System.lineSeparator() +
						"ID: "+ job.getId() + System.lineSeparator() +
            "Name: "+ job.getName() + System.lineSeparator() +
            "Employer: "+ job.getEmployer().toString() + System.lineSeparator() +
            "Location: "+ job.getLocation().toString() + System.lineSeparator() +
            "Position Type: "+ job.getPositionType().toString() + System.lineSeparator() +
            "Core Competency: "+ job.getCoreCompetency().toString() +
						System.lineSeparator()
		);
	}

	@Test
	public void testToStringHandlesEmptyField() {

		Job job = new Job(
				"",
				new Employer(""),
				new Location(""),
				new PositionType(""),
				new CoreCompetency("")
		);

		String dna = "Data not available"; // must replace each empty field

		assertEquals(
				System.lineSeparator() +
						"ID: "+ job.getId() + System.lineSeparator() +
						"Name: "+ dna + System.lineSeparator() +
						"Employer: "+ dna + System.lineSeparator() +
						"Location: "+ dna + System.lineSeparator() +
						"Position Type: "+ dna + System.lineSeparator() +
						"Core Competency: "+ dna +
						System.lineSeparator(),
				job.toString()
		);
	}

	@Test
	public void testIdOnlyJob() {

//		if Job object ONLY contains id field data
//			return "OOPS! This job does not seem to exist."

		Job job = new Job();
		assertEquals(job.toString(), "OOPS! This job does not seem to exist.");
	}
}