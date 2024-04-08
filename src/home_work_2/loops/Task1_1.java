package home_work_2.loops;
/* если хотите можете добавить проверки на корректность ввода данных. Число положительное, максимум long.
 * 1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
 * Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
 * Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
 *   	1.1.1. Используя только цикл
 *   	1.1.2.* Используя рекурсию
 */

public class Task1_1 {
    private static final int MIN_INPUT_NUMBER = 1;

    public static void main(String[] args) {
        long inputNumber;
        long maxInputNumber = Long.MAX_VALUE;
        if (args.length != 0) {
            inputNumber = Long.parseLong(args[0]);
            System.out.println("Вы ввели " + inputNumber);
            if (!(inputNumber >= MIN_INPUT_NUMBER)) {
                System.out.println("Вы ввели неверное значение. Введите от " + MIN_INPUT_NUMBER + " до " + maxInputNumber);
                return;
            }
        }
        else {
            System.out.println("Вы не ввели значение в консоль");
            return;
        }

        long result = factorial(inputNumber);
        if (result < 0) {
            System.out.println("При выполнении программы произошло переполнение!");
            return;
        }
        System.out.println(result);
        System.out.println(factorialResult(inputNumber, result));
    }

    /**
     * Метод для вывода результата расчета факториала в строку
     * @param inputNumber  число, факториал которого расчитывается
     * @param result результат расчета факториала
     * @return строка типа  1 * 2 * 3 * 4 * 5 = ответ
     */
   public static String factorialResult(long inputNumber, long result){
       long currentNumber = 1;
       StringBuffer stringBuffer = new StringBuffer();
       while (currentNumber <= inputNumber ){
           stringBuffer.append(currentNumber);

           if (currentNumber < inputNumber) {
               stringBuffer.append(" * ");
           } else {
               stringBuffer.append(" = ");
           }
           currentNumber++;
       }
       return stringBuffer.append(result).toString();
   }

    /**
     * Метод для расчета факториала
     * @param inputNumber число, факториал которого расчитывается
     * @return результат расчета. Если результат отрицательный - произошло переполнение
     */
    public static long factorial(long inputNumber){
        long currentNumber = 1;
        long multiplication = 1;
        while (currentNumber <= inputNumber ){
            multiplication *= currentNumber;
            currentNumber++;
            if (multiplication < 0) {
                return -1;
            }
        }
        return multiplication;
    }
}
