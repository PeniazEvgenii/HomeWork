package home_work_3.calcs.additional;

/* 6. Создать класс CalculatorWithCounterAutoSuper.
 *	 6.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
 *	 6.2 Данный класс наследует класс CalculatorWithMathExtends.
 *	 6.3 Данный класс переопределяет все методы полученные в результате наследования и в этих методах должен быть реализован механизм учёта их использования
 *	 (учёт общий для всех методов класса),
 *   а вместо реализации математики при помощи ключевого слова super вызывает данный метод у родителя. Например вызвали метод plus(7, 3) который должен сложить два числа и вернуть результат сложения.
 *   Внутри метода plus() пишем реализацию учета, а после делаем вызов super.plus(7, 3). Использование super позволит вызвать реализацию из родительского класса.
 *	 6.4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
 *	 6.5 Создать класс CalculatorWithCounterAutoSuperMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать
 *   выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long countOperation;

    /**
     *  Метод для получения количества использований калькулятора
     * @return количество использований калькулятора
     */
    public long getCountOperation() {
        return countOperation;
    }

    /**
     * Метод возведение в целую степень дробного положительного числа, используя библиотеку Math.
     * Математика реализована в родительском классе {@link CalculatorWithMathExtends#getPowerOfNumber(double x, int y) }
     * @param x дробного положительного число, возводимое в степень
     * @param y степень (целое число)
     * @return результат возведения в степень,  return -1 - если введено не положительное число
     */
    @Override
    public double getPowerOfNumber(double x, int y) {
        countOperation++;
        return super.getPowerOfNumber(x, y);
    }

    /**
     * Метод нахождения модуля числа, используя библиотеку Math
     * Математика реализована в родительском классе {@link CalculatorWithMathExtends#getModuleOfNumber(double x)}
     * @param x число, от которого исчем модуль
     * @return модуля числа
     */
    @Override
    public double getModuleOfNumber(double x) {
        countOperation++;
        return super.getModuleOfNumber(x);
    }

    /**
     * Метод нахождения квадратного корня, используя библиотеку Math
     * Математика реализована в родительском классе {@link CalculatorWithMathExtends#getSquareRoot(double x)}
     * @param x число, от которого исчем квадратный корень
     * @return результат вычисления квадратного корня, return = NaN - если передан отрицательный параметр x
     */
    @Override
    public double getSquareRoot(double x) {
       countOperation++;
       return super.getSquareRoot(x);
    }

    /**
     * Метод получения результата деления одного числа на второе
     * Математика реализована в {@link home_work_3.calcs.simple.CalculatorWithOperator#getDivision(double x, double y)}
     * @param x делимое
     * @param y делитель
     * @return результат деления (частное)
     */
    @Override
    public double getDivision(double x, double y) {
       countOperation++;
       return super.getDivision(x, y);
    }

    /**
     * Метод получения результата умножения одного числа на второе
     * Математика реализована в {@link home_work_3.calcs.simple.CalculatorWithOperator#getMultiplicatin(double x, double y)}
     * @param x множитель
     * @param y множитель
     * @return результат перемножения параметров (произведение)
     */
    @Override
    public double getMultiplicatin(double x, double y) {
       countOperation++;
       return super.getMultiplicatin(x, y);
    }

    /**
     * Метод получения результата вычитания одного числа на второе
     * Математика реализована в {@link home_work_3.calcs.simple.CalculatorWithOperator#getSubtruction(double x, double y)}
     * @param x уменьшаемое
     * @param y уменьшитель
     * @return результат вычитания (разность)
     */
    @Override
    public double getSubtruction(double x, double y) {
       countOperation++;
       return super.getSubtruction(x, y);
    }

    /**
     * Метод возведение в целую степень дробного положительного числа
     * Математика реализована в {@link home_work_3.calcs.simple.CalculatorWithOperator#getAddition(double x, double y)}
     * @param x дробного положительного число, возводимое в степень
     * @param y степень (целое число)
     * @return результат возведения в степень,  return -1 - если введено не положительное число
     */
    @Override
    public double getAddition(double x, double y) {
       countOperation++;
       return super.getAddition(x, y);
    }
}
