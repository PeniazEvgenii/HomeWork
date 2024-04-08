package test.home_work_1;

import home_work_1.LetterCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LetterCheckTest {

    @Test
    public void isLetterTrueTest() {
        Assertions.assertTrue(LetterCheck.isLetter((char) 65));
        Assertions.assertTrue(LetterCheck.isLetter('a'));
        Assertions.assertTrue(LetterCheck.isLetter('z'));
        Assertions.assertTrue(LetterCheck.isLetter('A'));
        Assertions.assertTrue(LetterCheck.isLetter('Z'));
    }

    @Test
    public void isLetterFalseTest() {
        Assertions.assertFalse(LetterCheck.isLetter((char) 91));
        Assertions.assertFalse(LetterCheck.isLetter((char) 64));
        Assertions.assertFalse(LetterCheck.isLetter((char) 123));
        Assertions.assertFalse(LetterCheck.isLetter('_'));
    }

    @Test
    public void isLetter2TrueTest() {
        Assertions.assertTrue(LetterCheck.isLetter2((char) 65));
        Assertions.assertTrue(LetterCheck.isLetter2('a'));
        Assertions.assertTrue(LetterCheck.isLetter2('z'));
        Assertions.assertTrue(LetterCheck.isLetter2('A'));
        Assertions.assertTrue(LetterCheck.isLetter2('Z'));
    }

    @Test
    public void isLetter2FalseTest() {
        Assertions.assertFalse(LetterCheck.isLetter2((char) 91));
        Assertions.assertFalse(LetterCheck.isLetter2((char) 64));
        Assertions.assertFalse(LetterCheck.isLetter2((char) 123));
        Assertions.assertFalse(LetterCheck.isLetter2('_'));
    }
}
