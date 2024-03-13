package home_work_3.runners;
/*
Создать класс WithoutCalculatorMain в котором необходимо посчитать следующие выражения:
	1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 */

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double result = 4.1 + 15 * 7 + Math.pow(28.0/5, 2);   // результат вычисления = 140.45999999999998
        System.out.println("Результат вычисления 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
