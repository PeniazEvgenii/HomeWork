package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
/*
 * 9. Создать класс CalculatorWithCounterAutoChoiceAgregation.
 * 	9.1 Все методы объявленные в данных классах НЕ статические (не имеют модификатор static).
 * 	9.2 В данном классе должны быть следующие варианты конструктора:
 * 		9.2.1 Принимающий объект типа CalculatorWithOperator
 * 		9.2.2 Принимающий объект типа CalculatorWithMathCopy
 * 		9.2.3 Принимающий объект типа CalculatorWithMathExtends
 * 	9.4 Данные класс также не умеет напрямую считать математику, они умеют делегировать расчёт математики калькулятору который передали в конструктор.
 * 	9.5 В классах должны присутствовать математические методы:
 * 		9.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 		9.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 	9.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
 */

public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calculatorOperator;
    private CalculatorWithMathCopy calculatorMathCopy;
    private CalculatorWithMathExtends calculatorMathExtends;
    private long countOperation;

    /**
     * Конструктор с параметром объект
     * @param calculator объект класса {@link CalculatorWithOperator}
     */
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator) {
        this.calculatorOperator = calculator;
    }

    /**
     * Конструктор с параметром объект
     * @param calculator объект класса {@link CalculatorWithMathCopy}
     */
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator) {
        this.calculatorMathCopy = calculator;
    }

    /**
     * Конструктор с параметром объект
     * @param calculator объект класса {@link CalculatorWithMathExtends}
     */
    public  CalculatorWithCounterAutoChoiceAgregation (CalculatorWithMathExtends calculator) {
        this.calculatorMathExtends = calculator;
    }


    /**
     *  Метод для получения количества использований калькулятора
     * @return количество использований калькулятора
     */
    public long getCountOperation() {
        return countOperation;
    }

    /**
     * Метод получения результата деления одного числа на второе
     * @param x делимое
     * @param y делитель
     * @return результат деления (частное)
     */
    public double getDivision(double x, double y) {
        countOperation++;
        if (calculatorOperator != null) {
            return calculatorOperator.getDivision(x, y);
        } else if (calculatorMathCopy != null) {
            return calculatorMathCopy.getDivision(x, y);
        } else {
            return calculatorMathExtends.getDivision(x, y);
        }
    }

    /**
     * Метод получения результата умножения одного числа на второе
     * @param x множитель
     * @param y множитель
     * @return результат перемножения параметров (произведение)
     */
    public double getMultiplicatin(double x, double y) {
        countOperation++;
        //return calculatorOperator.getMultiplicatin(x, y);
        if (calculatorOperator != null) {
            return calculatorOperator.getMultiplicatin(x, y);
        } else if (calculatorMathCopy != null) {
            return calculatorMathCopy.getMultiplicatin(x, y);
        } else {
            return calculatorMathExtends.getMultiplicatin(x, y);
        }
    }

    /**
     * Метод получения результата вычитания одного числа на второе
     * @param x уменьшаемое
     * @param y уменьшитель
     * @return результат вычитания (разность)
     */
    public double getSubtruction(double x, double y) {
        countOperation++;
        //return calculatorOperator.getSubtruction(x, y);
        if (calculatorOperator != null) {
            return calculatorOperator.getSubtruction(x, y);
        } else if (calculatorMathCopy != null) {
            return calculatorMathCopy.getSubtruction(x, y);
        } else {
            return calculatorMathExtends.getSubtruction(x, y);
        }
    }

    /**
     * Метод получения суммы двух чисел
     * @param x слагаемое
     * @param y слагаемое
     * @return сумма двух слагаемых
     */
    public double getAddition(double x, double y) {
        countOperation++;
        //return calculatorOperator.getAddition(x, y);
        if (calculatorOperator != null) {
            return calculatorOperator.getAddition(x, y);
        } else if (calculatorMathCopy != null) {
            return calculatorMathCopy.getAddition(x, y);
        } else {
            return calculatorMathExtends.getAddition(x, y);
        }
    }

    /**
     * Метод возведение в целую степень дробного положительного числа
     * @param x дробного положительного число, возводимое в степень
     * @param y степень (целое число)
     * @return результат возведения в степень,  return -1 - если введено не положительное число
     */
    public double getPowerOfNumber(double x, int y) {
        countOperation++;
        //return calculatorOperator.getPowerOfNumber(x, y);
        if (calculatorOperator != null) {
            return calculatorOperator.getPowerOfNumber(x, y);
        } else if (calculatorMathCopy != null) {
            return calculatorMathCopy.getPowerOfNumber(x, y);
        } else {
            return calculatorMathExtends.getPowerOfNumber(x, y);
        }
    }

    /**
     * Метод нахождения модуля числа
     * @param x число, от которого исчем модуль
     * @return модуля числа
     */
    public double getModuleOfNumber(double x) {
        countOperation++;
       // return calculatorOperator.getModuleOfNumber(x);
        if (calculatorOperator != null) {
            return calculatorOperator.getModuleOfNumber(x);
        } else if (calculatorMathCopy != null) {
            return calculatorMathCopy.getModuleOfNumber(x);
        } else {
            return calculatorMathExtends.getModuleOfNumber(x);
        }
    }

    /**
     * Метод нахождения квадратного корня
     * @param x число, от которого исчем квадратный корень
     * @return результат вычисления квадратного корня, return = NaN - если передан отрицательный параметр x
     */
    public double getSquareRoot(double x) {
        countOperation++;
       // return calculatorOperator.getSquareRoot(x);
        if (calculatorOperator != null) {
            return calculatorOperator.getSquareRoot(x);
        } else if (calculatorMathCopy != null) {
            return calculatorMathCopy.getSquareRoot(x);
        } else {
            return calculatorMathExtends.getSquareRoot(x);
        }
    }
}
