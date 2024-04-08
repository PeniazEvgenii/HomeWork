package test.home_work_3.simple;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.*;

/**
 * 4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.45999999999998
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorWithMathExtendsTest {

    private final ICalculator calc = new CalculatorWithMathExtends();

    @Test
    @Order(8)
    public void expressionTest() {
        double degree = calc.getPowerOfNumber(calc.getDivision(28, 5), 2);
        double multiplication = calc.getMultiplicatin(15, 7);
        double result = calc.getAddition(4.1, calc.getAddition(multiplication, degree));
        Assertions.assertEquals(140.4599, result, 0.0001);

    }


    @Test
    @Order(1)
    public void getDivisionTest() {
        Assertions.assertEquals(5, calc.getDivision(25,5));
        Assertions.assertEquals(0, calc.getDivision(0,5));
        Assertions.assertEquals(-2, calc.getDivision(-10,5));
        Assertions.assertEquals(0.2, calc.getDivision(1,5));
        Assertions.assertEquals(1, calc.getDivision(Double.MAX_VALUE,Double.MAX_VALUE));
    }

    @Test
    @Order(2)
    public void getMultiplicatinTest() {
        Assertions.assertEquals(100, calc.getMultiplicatin(25,4));
        Assertions.assertEquals(0, calc.getMultiplicatin(0,5));
        Assertions.assertEquals(-5, calc.getMultiplicatin(-1,5));
        Assertions.assertEquals(0.8, calc.getMultiplicatin(0.2,4));
        Assertions.assertEquals(Double.MAX_VALUE, calc.getMultiplicatin(Double.MAX_VALUE,1));
    }

    @Order(3)
    @Test
    public void getSubtractionTest() {
        Assertions.assertEquals(-3, calc.getSubtruction(1,4));
        Assertions.assertEquals(0, calc.getSubtruction(0,0));
        Assertions.assertEquals(4, calc.getSubtruction(-1,-5));
        Assertions.assertEquals(-3.8, calc.getSubtruction(0.2,4));
    }
    @Order(4)
    @Test
    public void getAdditionTest() {
        Assertions.assertEquals(5, calc.getAddition(1,4));
        Assertions.assertEquals(-1, calc.getAddition(Integer.MAX_VALUE,Integer.MIN_VALUE));
        Assertions.assertEquals(0, calc.getAddition(0,0));
        Assertions.assertEquals(-6, calc.getAddition(-1,-5));
        Assertions.assertEquals(4.2, calc.getAddition(0.2,4));
    }

    @Order(5)
    @Test
    public void getPowerOfNumberTest() {
        Assertions.assertEquals(1, calc.getPowerOfNumber(1,4));
        Assertions.assertEquals(625, calc.getPowerOfNumber(25,2));
        Assertions.assertEquals(-1, calc.getPowerOfNumber(0,0));
        Assertions.assertEquals(-1, calc.getPowerOfNumber(-1,2));
        Assertions.assertEquals(0.04, calc.getPowerOfNumber(0.2,2),0.001);
    }

    @Order(6)
    @Test
    public void getModuleOfNumberTest() {
        Assertions.assertEquals(10, calc.getModuleOfNumber(10));
        Assertions.assertEquals(0, calc.getModuleOfNumber(0));
        Assertions.assertEquals(10, calc.getModuleOfNumber(-10));
    }

    @Order(7)
    @Test
    public void getSquareRootTest() {
        Assertions.assertEquals(4, calc.getSquareRoot(16));
        Assertions.assertEquals(0, calc.getSquareRoot(0));
    }
}
