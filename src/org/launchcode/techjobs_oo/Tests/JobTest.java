package org.launchcode.techjobs_oo.Tests;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

public class JobTest {
    Job thingOne;
    Job thingTwo;

    @Before
    public void createJobs() {
        thingOne = new Job();
        thingTwo = new Job();
    }

    @Test
    public void testSettingJodId() {
        assertFalse(thingOne.equals(thingTwo));
        assertTrue(thingOne.getId() != thingTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobSearchField = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(jobSearchField instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        Object jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Object jobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(jobOne.equals(jobTwo));
    }

    @Test
    public void testToString() {
        Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String output =
            "\nID: " +  jobOne.getId() + "\n" +
            "Name: " + jobOne.getName() + "\n" +
            "Employer: " + jobOne.getEmployer() + "\n" +
            "Location: " + jobOne.getLocation() + "\n" +
            "Position Type: " + jobOne.getPositionType().getValue() + "\n" +
            "Core Competency: " + jobOne.getCoreCompetency() + "\n";
       //System.out.println(output);
        assertEquals(output, jobOne.toString());
    }

}
