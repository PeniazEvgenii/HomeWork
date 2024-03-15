package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private ICalculator calculator;
    private double result;
    private double memory;

    /**
     * Конструктор с одним параметром
     * @param calculator объект типа ICalculator
     */
    public CalculatorWithMemoryDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }


    public ICalculator getCalculator() {
        return calculator;
    }



    /**
     * Метод для сохранения результата вычисления в память калькулятора
     */
    public void save(){
        memory = result;
    }

    /**
     * Метод для выгрузки значения из памяти калькулятора
     * @return значение из памяти
     */
    public double load() {
        double temp;
        temp = memory;
        memory = 0;
        return temp;
    }

    /**
     * Метод получения результата деления одного числа на второе
     * @param x делимое
     * @param y делитель
     * @return результат деления (частное)
     */
    public double getDivision(double x, double y) {
        result = calculator.getDivision(x, y);
        return result;
    }

    /**
     * Метод получения результата умножения одного числа на второе
     *
     * @param x множитель
     * @param y множитель
     * @return результат перемножения параметров (произведение)
     */
    public double getMultiplicatin(double x, double y) {
        result = calculator.getMultiplicatin(x, y);
        return result;
    }

    /**
     * Метод получения результата вычитания одного числа на второе
     * @param x уменьшаемое
     * @param y уменьшитель
     * @return результат вычитания (разность)
     */
    public double getSubtruction(double x, double y) {
        result = calculator.getSubtruction(x, y);
        return result;
    }

    /**
     * Метод получения суммы двух чисел
     * @param x слагаемое
     * @param y слагаемое
     * @return сумма двух слагаемых
     */
    public double getAddition(double x, double y) {
        result = calculator.getAddition(x, y);
        return result;
    }

    /**
     * Метод возведение в целую степень дробного положительного числа.
     * @param x дробного положительного число, возводимое в степень
     * @param y степень (целое число)
     * @return результат возведения в степень,  return -1 - если введено не положительное число
     */
    public double getPowerOfNumber(double x, int y) {
        result = calculator.getPowerOfNumber(x, y);
        return result;
    }

    /**
     * Метод нахождения модуля числа.
     * @param x число, от которого исчем модуль
     * @return модуля числа
     */
    public double getModuleOfNumber(double x) {
        result = calculator.getModuleOfNumber(x);
        return result;
    }

    /**
     * Метод нахождения квадратного корня.
     * @param x число, от которого исчем квадратный корень
     * @return результат вычисления квадратного корня, return = NaN - если передан отрицательный параметр x
     */
    public double getSquareRoot(double x) {
        result = calculator.getSquareRoot(x);
        return result;
    }
}
