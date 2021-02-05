package org.launchcode.techjobs_oo.Tests;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;

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
        //assertEquals();
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobSearchField =
    }

}
