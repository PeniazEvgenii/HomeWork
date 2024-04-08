package home_work_2.loops;

public class Task1_1Recurs {
    private static final int MIN_INPUT_NUMBER = 1;

    public static void main(String[] args) {
        long inputNumber;
        long maxInputNumber = Long.MAX_VALUE;
        if (args.length != 0) {
            inputNumber = Long.parseLong(args[0]);
            System.out.println("Вы ввели " + inputNumber);
            boolean checkInput = inputNumber >= MIN_INPUT_NUMBER && inputNumber <= maxInputNumber;
            if (!checkInput) {
                System.out.println("Вы ввели неверное значение. Введите от " + MIN_INPUT_NUMBER + " до " + maxInputNumber);
                return;
            }
        } else {
            System.out.println("Вы не ввели значение в консоль");
            return;
        }

        long result = recurs(inputNumber);
        System.out.println(result);
        System.out.println(recursResult(inputNumber, result));
    }

    /**
     * Метод для расчета факториала
     * @param num число, факториал которого расчитывается
     * @return результат расчета
     */
    public static long recurs(long num) {
        if (num >= MIN_INPUT_NUMBER) {
            return  num * recurs(num - 1);
        } else {
            return 1;
        }
    }

    /**
     * Метод для вывода результата расчета факториала в строку
     * @param inputNumber  число, факториал которого расчитывается
     * @param result результат расчета факториала
     * @return строка типа  1 * 2 * 3 * 4 * 5 = ответ
     */
    public static String recursResult(long inputNumber, long result){
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

}
