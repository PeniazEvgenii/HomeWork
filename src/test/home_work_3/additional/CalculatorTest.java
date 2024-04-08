package test.home_work_3.additional;

import home_work_3.calcs.additional.*;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final ICalculator calc = new CalculatorWithCounterClassic();
    private final ICalculator calc2 = new CalculatorWithCounterAutoSuper();
    private final CalculatorWithCounterAutoComposite calc3 = new CalculatorWithCounterAutoComposite();
    private final CalculatorWithCounterAutoAgregation calc4 = new CalculatorWithCounterAutoAgregation(new CalculatorWithOperator());
    private final CalculatorWithCounterAutoChoiceAgregation calc5 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
    private final CalculatorWithCounterAutoAgregationInterface calc6 = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
    private final CalculatorWithMemory calcMemory = new CalculatorWithMemory(new CalculatorWithMathCopy());
    private final ICalculator calcDecor = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));


    @DisplayName("test for CalculatorWithCounterClassic")
    @Test
    public void counterClassicTest() {
        double degree = calc.getPowerOfNumber(calc.getDivision(28, 5), 2);
        double multiplication = calc.getMultiplicatin(15, 7);
        double result = calc.getAddition(4.1, calc.getAddition(multiplication, degree));
        Assertions.assertEquals(140.4599, result, 0.0001);
    }

    @DisplayName("test for CalculatorWithCounterAutoSuper")
    @Test
    public void counterAutoSuperTest() {
        double degree = calc2.getPowerOfNumber(calc2.getDivision(28, 5), 2);
        double multiplication = calc2.getMultiplicatin(15, 7);
        double result = calc2.getAddition(4.1, calc2.getAddition(multiplication, degree));
        Assertions.assertEquals(140.4599, result, 0.0001);
    }

    @DisplayName("test for CalculatorWithCounterAutoComposite")
    @Test
    public void counterAutoCompositeTest() {
        double degree = calc3.getPowerOfNumber(calc3.getDivision(28, 5), 2);
        double multiplication = calc3.getMultiplicatin(15, 7);
        double result = calc3.getAddition(4.1, calc3.getAddition(multiplication, degree));
        Assertions.assertEquals(140.4599, result, 0.0001);
    }

    @DisplayName("test for CalculatorWithCounterAutoAgregation")
    @Test
    public void counterAutoAgregationTest() {
        double degree = calc4.getPowerOfNumber(calc4.getDivision(28, 5), 2);
        double multiplication = calc4.getMultiplicatin(15, 7);
        double result = calc4.getAddition(4.1, calc4.getAddition(multiplication, degree));
        Assertions.assertEquals(140.4599, result, 0.0001);
    }

    @DisplayName("test for CalculatorWithCounterAutoChoiceAgregation")
    @Test
    public void counterAutoChoiceAgregationTest() {
        double degree = calc5.getPowerOfNumber(calc5.getDivision(28, 5), 2);
        double multiplication = calc5.getMultiplicatin(15, 7);
        double result = calc5.getAddition(4.1, calc5.getAddition(multiplication, degree));
        Assertions.assertEquals(140.4599, result, 0.0001);
    }

    @DisplayName("test for CalculatorWithCounterAutoAgregationInterface")
    @Test
    public void counterAutoAgregationInterfaceTest() {
        double degree = calc6.getPowerOfNumber(calc6.getDivision(28, 5), 2);
        double multiplication = calc6.getMultiplicatin(15, 7);
        double result = calc6.getAddition(4.1, calc6.getAddition(multiplication, degree));
        Assertions.assertEquals(140.4599, result, 0.0001);
    }

    @DisplayName("test for CalculatorWithMemory")
    @Test
    public void calculatorWithMemoryTest() {
        calcMemory.getDivision(28, 5);
        calcMemory.save();
        calcMemory.getPowerOfNumber(calcMemory.load(), 2);
        calcMemory.save();
        calcMemory.getAddition(4.1, calcMemory.load());
        calcMemory.save();
        calcMemory.getAddition(calcMemory.load(), calcMemory.getMultiplicatin(15, 7));
        calcMemory.save();
        double result = calcMemory.load();
        Assertions.assertEquals(140.4599, result, 0.0001);
    }

    @DisplayName("test for CalculatorDecorator")
    @Test
    public void calculatorDecoratorTest() {
        double degree = calcDecor.getPowerOfNumber(calcDecor.getDivision(28, 5), 2);
        double multiplication = calcDecor.getMultiplicatin(15, 7);
        double result = calcDecor.getAddition(4.1, calcDecor.getAddition(multiplication, degree));
        Assertions.assertEquals(140.4599, result, 0.0001);
    }
}
