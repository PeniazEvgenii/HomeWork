package test.home_work_1.question;

import home_work_1.NameThree;
import org.junit.jupiter.api.Test;

public class NamesThreeTest {
    private final NamesTestDeligation threeName = new NamesTestDeligation(new NameThree());

    @Test
    public void testInputSmallLetterVasia() {
       threeName.testInputSmallLetterVasia();
    }

    @Test
    public void testInputBigLetterVasia() {
        threeName.testInputBigLetterVasia();
    }

    @Test
    public void testInputSmallLetterAnastasia() {
        threeName.testInputSmallLetterAnastasia();
    }

    @Test
    public void testInputBigLetterAnastasia() {
        threeName.testInputBigLetterAnastasia();
    }

    @Test
    public void testInputOtherName() {
        threeName.testInputOtherName();
    }

    @Test
    public void testInputEmty() {
        threeName.testInputEmty();
    }
}
