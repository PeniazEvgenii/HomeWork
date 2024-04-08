package test.home_work_1;

import home_work_1.Sleeping;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SleepingTest {
    @Test
    public void testSleepInWeekDayTrueVocationTrue(){
        Assertions.assertTrue(Sleeping.sleepIn(true, true));
    }

    @Test
    public void testSleepInWeekDayFalseVocationTrue(){
        Assertions.assertTrue(Sleeping.sleepIn(false, true));
    }

    @Test
    public void testSleepInWeekDayTrueVocationFalse(){
        Assertions.assertFalse(Sleeping.sleepIn(true, false));
    }

    @Test
    public void testSleepInWeekDayFalseVocationFalse(){
        Assertions.assertTrue(Sleeping.sleepIn(false, false));
    }

}
