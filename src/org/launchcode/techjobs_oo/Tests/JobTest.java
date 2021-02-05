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

   /* @Test
    public void testJobsForEquality() {
        Object jobOne = new Job("Product tester", "ACME", "Desert", "Quality control", "Persistence");
        Object jobTwo = new Job("Product tester", "ACME", "Desert", "Quality control", "Persistence");

    }*/

}
