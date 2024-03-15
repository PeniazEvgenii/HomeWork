package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private ICalculator calculator;
    private long countOperation;

    /**
     * Конструктор с одним параметром
     * @param calculator объект типа ICalculator
     */
    public CalculatorWithCounterAutoDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }


    public ICalculator getCalculator() {
        return calculator;
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
        return calculator.getDivision(x, y);
    }

    /**
     * Метод получения результата умножения одного числа на второе
     * @param x множитель
     * @param y множитель
     * @return результат перемножения параметров (произведение)
     */
    public double getMultiplicatin(double x, double y) {
        countOperation++;
        return calculator.getMultiplicatin(x, y);
    }

    /**
     * Метод получения результата вычитания одного числа на второе
     * @param x уменьшаемое
     * @param y уменьшитель
     * @return результат вычитания (разность)
     */
    public double getSubtruction(double x, double y) {
        countOperation++;
        return calculator.getSubtruction(x, y);
    }

    /**
     * Метод получения суммы двух чисел
     * @param x слагаемое
     * @param y слагаемое
     * @return сумма двух слагаемых
     */
    public double getAddition(double x, double y) {
        countOperation++;
        return calculator.getAddition(x, y);
    }

    /**
     * Метод возведение в целую степень дробного положительного числа.
     * @param x дробного положительного число, возводимое в степень
     * @param y степень (целое число)
     * @return результат возведения в степень,  return -1 - если введено не положительное число
     */
    public double getPowerOfNumber(double x, int y) {
        countOperation++;
        return calculator.getPowerOfNumber(x, y);
    }

    /**
     * Метод нахождения модуля числа.
     * @param x число, от которого исчем модуль
     * @return модуля числа
     */
    public double getModuleOfNumber(double x) {
        countOperation++;
        return calculator.getModuleOfNumber(x);
    }

    /**
     * Метод нахождения квадратного корня.
     * @param x число, от которого исчем квадратный корень
     * @return результат вычисления квадратного корня, return = NaN - если передан отрицательный параметр x
     */
    public double getSquareRoot(double x) {
        countOperation++;
        return calculator.getSquareRoot(x);
    }
}
