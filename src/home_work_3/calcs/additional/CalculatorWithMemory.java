package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

/**
 * 12*. Создать CalculatorWithMemory используя аналогичные принципы построения класса CalculatorWithCounterAutoAgregationInterface.
 *        12.1 Данный калькулятор предназначен для того чтобы расширить возможности калькулятора и обеспечить его дополнительной функцией памяти. В принципе работает как калькулятор из реальной жизни.
 *        12.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 *        12.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
 *	12.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики калькулятору который передали в конструктор
 *	12.5 В классе должны присутствовать математические методы:
 *        12.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 *        12.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 *        12.6 Функция памяти работает через методы:
 *        12.6.1 Записать в память результат выполнения последнего вызванного метода. У данного метода не должно быть параметров. Данный метод вызывается непосредтвенно пользователем, а не автоматический. Пример void save();
 *		12.6.2 Получить из памяти записанное значение. При получении записи из памяти память стирается, при записи нового значения память перезаписывается. Данный метод вызывается непосредтвенно пользователем,
 * а не автоматический. Пример double load();
 *	12.7 В этом калькуляторе НЕТ ФУНКЦИИ ПОДСЧЁТА количества использований
 */

public class CalculatorWithMemory {
    private ICalculator calculator;
    private double result;
    private double memory;

    /**
     * Конструктор с одним параметром
     * @param calculator объект типа ICalculator
     */
    public CalculatorWithMemory(ICalculator calculator) {
        this.calculator = calculator;
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
