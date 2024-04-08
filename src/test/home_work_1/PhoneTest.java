package test.home_work_1;

import home_work_1.Phone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneTest {

    @Test
    public void createPhoneNumber() {
        String result = Phone.createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0});
        String expectedResult = "(123) 456-7890";
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void createPhoneNumberArrayZero() {
        String result = Phone.createPhoneNumber(new int[]{0,0,0,0,0,0,0,0,0,0});
        String expectedResult = "(000) 000-0000";
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void createPhoneNumberArrayNine() {
        String result = Phone.createPhoneNumber(new int[]{9,9,9,9,9,9,9,9,9,9});
        String expectedResult = "(999) 999-9999";
        Assertions.assertEquals(expectedResult, result);
    }

}
