package home_work_2.loops;
/*
 * 1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход
 * вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что
 * пользователь ввёл некорректные данные.
 *  1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
 *  1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
 *  1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
 */

public class Task1_2 {
    public static final int MIN_INPUT_NUMBER = 1;

    public static void main(String[] args) {
        long inputNumber;
        long maxInputNumber = Long.MAX_VALUE;

        if (args.length != 0) {
            String firstArgument = args[0];

            if (firstArgument.matches("-?\\d+")) {
                System.out.println("Вы ввели: " + firstArgument + ". Это целое число!");   // можно эту строчку опустить
            } else if (firstArgument.matches("\\d+\\.\\d+")) {
                System.out.println("Вы ввели: " + firstArgument + ". Это вещественное число!");
                return;
            } else {
                System.out.println("Вы ввели: " + firstArgument + ". Это не число!");
                return;
            }

            inputNumber = Long.parseLong(firstArgument);

            if (!(inputNumber >= MIN_INPUT_NUMBER)) {
               System.out.println("Вы ввели неверное значение. Введите от " + MIN_INPUT_NUMBER + " до " + maxInputNumber);
                return;
            }

        } else {
            System.out.println("Вы не ввели значение в консоль");
            return;
        }

        long result = getDigitMultiplacation(inputNumber);
        if(result == -1) {
            System.out.println("передано неверное значения. Необходимо число от 1 и выше");
        } else {
            System.out.println(printDigitMultiplacation(inputNumber, result));
        }

    }

    /**
     * Метод расчета произведения цифр числа
     * @param inputNumber целое положительное число
     * @return результат перемножения цифр числа. Результат -1, если число меньше 1;
     */
    public static long getDigitMultiplacation(long inputNumber) {
        if (inputNumber < 1) {
            return -1;
        }
        long multiplication = 1;
        while (inputNumber > 0) {
            multiplication *= inputNumber % 10;
            inputNumber /= 10;
        }
        return multiplication;
    }

    /**
     * Метод для вывода результата расчета произведения цифр числа в строку
     * @param inputNumber  число, произведение цифр которого расчитывается
     * @param result результат расчета произведение цифр
     * @return строка типа  1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
     */
    public static String printDigitMultiplacation(long inputNumber, long result) {
        StringBuffer stringBuffer = new StringBuffer();
        while (inputNumber > 0) {
            stringBuffer.append(inputNumber % 10);
            inputNumber /= 10;
            if (inputNumber > 0) {
                stringBuffer.append(" * ");
            } else {
                stringBuffer.reverse();
            }
        }
        stringBuffer.append(" = ").append(result);
        return stringBuffer.toString();
    }
}
