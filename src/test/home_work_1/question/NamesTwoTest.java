package test.home_work_1.question;

import home_work_1.NameTwo;
import org.junit.jupiter.api.Test;

public class NamesTwoTest {
    private final NamesTestDeligation twoName = new NamesTestDeligation(new NameTwo());

    @Test
    public void testInputSmallLetterVasia() {
       twoName.testInputSmallLetterVasia();
    }

    @Test
    public void testInputBigLetterVasia() {
        twoName.testInputBigLetterVasia();
    }

    @Test
    public void testInputSmallLetterAnastasia() {
        twoName.testInputSmallLetterAnastasia();
    }

    @Test
    public void testInputBigLetterAnastasia() {
        twoName.testInputBigLetterAnastasia();
    }

    @Test
    public void testInputOtherName() {
        twoName.testInputOtherName();
    }

    @Test
    public void testInputEmty() {
        twoName.testInputEmty();
    }
}
