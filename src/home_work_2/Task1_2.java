package home_work_2;
/*
 * 1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход
 * вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что
 * пользователь ввёл некорректные данные.
 *  1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
 *  1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
 *  1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
 */

public class Task1_2 {
    public static final int MIN_INPUT_NUMBER = 1;    // проверить положит и long плюс условия по задаче

    public static void main(String[] args) {
        long inputNumber;
        long maxInputNumber = Long.MAX_VALUE;

        if (args.length != 0) {    //строка не нулевая, но что в ней?
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

        StringBuffer stringBuffer = new StringBuffer();
        long multiplication = 1;

        while (inputNumber > 0) {
            multiplication *= inputNumber % 10;
            stringBuffer.append(inputNumber % 10);
            inputNumber /= 10;

            if (inputNumber % 10 != 0) {
                stringBuffer.append(" * ");
            } else {
                stringBuffer.reverse().append(" = " + multiplication);
            }
        }

        System.out.println(stringBuffer.toString());

    }
}
