package test.home_work_1.question;

import home_work_1.api.ICommunicationPrinter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class NamesTestDeligation {

      private final ICommunicationPrinter one;
  //  private final ICommunicationPrinter two = new NameTwo();
  //  private final ICommunicationPrinter one = new NameThree();

    public NamesTestDeligation(ICommunicationPrinter one) {
        this.one = one;
    }

   @Test
   public void testInputSmallLetterVasia() {
       String result = one.welcom("вася");
       String expectedResult = "Привет!\nЯ тебя так долго ждал";
       Assertions.assertEquals(expectedResult, result);
   }

    @Test
    public void testInputBigLetterVasia() {
        String result = one.welcom("ВАСЯ");
        String expectedResult = "Привет!\nЯ тебя так долго ждал";
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testInputSmallLetterAnastasia() {
        String result = one.welcom("анастасия");
        String expectedResult = "Я тебя так долго ждал";
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testInputBigLetterAnastasia() {
        String result = one.welcom("АНАСТАСИЯ");
        String expectedResult = "Я тебя так долго ждал";
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testInputOtherName() {
        String result = one.welcom("коля");
        String expectedResult = "Добрый день, а вы кто?";
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testInputEmty() {
        String result = one.welcom("");
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
