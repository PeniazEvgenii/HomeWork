package test.home_work_1;

import home_work_1.api.ICommunicationPrinter;
import home_work_1.NameThree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameThreeTest {

    private final ICommunicationPrinter threeName = new NameThree();

    @Test
    public void testInputSmallLetterVasia() {
        String result = threeName.welcom("вася");
        String expectedResult = "Привет!\nЯ тебя так долго ждал";
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testInputBigLetterVasia() {
        String result = threeName.welcom("ВАСЯ");
        String expectedResult = "Привет!\nЯ тебя так долго ждал";
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testInputSmallLetterAnastasia() {
        String result = threeName.welcom("анастасия");
        String expectedResult = "Я тебя так долго ждал";
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testInputBigLetterAnastasia() {
        String result = threeName.welcom("АНАСТАСИЯ");
        String expectedResult = "Я тебя так долго ждал";
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testInputOtherName() {
        String result = threeName.welcom("коля");
        String expectedResult = "Добрый день, а вы кто?";
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testInputEmty() {
        String result = threeName.welcom("");
        String expectedResult = "Добрый день, а вы кто?";
        Assertions.assertEquals(expectedResult, result);
    }

    //  @Test
    //  public void testInputNull() {
    //      String result = one.welcom(null);
    //      String expectedResult = "Добрый день, а вы кто?";
    //      Assertions.assertEquals(expectedResult, result);
    //  }
}

