package home_work_2.loops;

import java.util.Scanner;
/*
 * 1.5. Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах.
 *  	 1.5.1. Найти наибольшую цифру натурального числа
 *  	 1.5.2. Вероятность четных случайных чисел
 *  	 1.5.3. Посчитать четные и нечетные цифры числа
 *  	 1.5.4. Ряд Фибоначчи
 *  	 1.5.5. Вывести ряд чисел в диапазоне с шагом
 *  	 1.5.6. Переворот числа
 */

public class Task1_5 {
    static Scanner console = new Scanner(System.in);

    public static final int MIN_NATURAL_NUMBER = 1;
    public static final int RANDOM_VALUE = 10_000;

    /** Метод нахождения наибольшей цифры натурального числа
     *  @param number - натуральное число
     *  @return возвращает максимальную цифру числа и
     *          возвращает -1 если передано число меньше 1
     */
    public static int getMaxDigit(int number) {
        if(number < 1) {
            return -1;
        }
        int currentNumber = number;
        int maxDigit = currentNumber % 10;
        while (currentNumber > 0) {
            if (maxDigit < currentNumber % 10) {
                maxDigit = currentNumber % 10;
            }
            currentNumber /= 10;
        }
        return maxDigit;
    }


    /** Метод нахождения вероятности четных случайных чисел
     *  @return возвращает процент сгенерированных четных чисел
     */
    public static double checkRandomGenerator(int value) {
        int valueEvenNumber = 0;
        int currentLoop = 0;
        while (value > currentLoop) {
            int random = (int)(Math.random()*100);
            if (random % 2 == 0) {
                valueEvenNumber++;
            }
            currentLoop++;
        }
        return (valueEvenNumber * 100.0) / value;
    }


    /** Метод нахождения количества четных цифр числа
     *  @param number - натуральное число
     *  @return возвращает сумму четных цифр числа, -1 если число не вещественное
     */
    public static int countEvenDigit(int number) {
        if(number < 1) {
            return -1;
        }
        int valueEven = 0;
        int currentNumber = number;
        while (currentNumber > 0) {
            if ((currentNumber % 10) % 2 == 0) {
                valueEven++;
            }
            currentNumber /= 10;
        }
        return  valueEven;
    }


    /** Метод нахождения количества нечетных цифр числа
     *  @param number - натуральное число
     *  @return возвращает сумму нечетных цифр числа, -1 если число не вещественное
     */
    public static int countOddDigit(int number) {
        if(number < 1) {
            return -1;
        }
        int valueOdd = 0;
        int currentNumber = number;
        while (currentNumber > 0) {
            if ((currentNumber % 10) % 2 != 0) {
                valueOdd++;
            }
            currentNumber /= 10;
        }
        return valueOdd;
    }


    /** Метод нахождения ряда Фибоначчи
     *  @param numberFib - натуральное число [1,45]
     *  @return возвращает массив fib, содержащий ряд Фибоначчи длиной numberFib или
     *          массив test нулевой длины, если переданы некорректные данные
     */
    public static int[] fibonacci(int numberFib) {
        if(numberFib < 1 || numberFib > 45){
            int[] test = {};                             //уместно ли возвращать пустой массив при плохом исходе в доп проверке?
            return test;
        }
        int[] fib = new int[numberFib];
        if (numberFib == 1) {
            fib[0] = 1;
            return fib;
        }
        fib[0] = 1;
        fib[1] = 2;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }


    /** Метод нахождения ряда чисел в диапазоне с шагом
     *  @param startRow - начальное число
     *  @param finishRow - конечное число
     *  @param step - шаг
     *  @return возвращает массив array, содержащий ряд чисел
     */
    public static int[] getRowOfNumbers (int startRow, int finishRow, int step){
        int size = 0;
        for (int i = startRow; i <= finishRow; i += step) {
            size++;
        }
        int[] array = new int[size];
        for (int j = startRow, index = 0; j <= finishRow; j += step, index++) {
            array[index] = j;
        }
        return array;
    }


    /** Метод для переворота натурального числа с помощью строки
     *  @param number - натуральное
     *  @return возвращает перевернутое число, -1 если передано ненатуральное числа
     */
    public static long toNumberReverse (long number) {
        if(number < 1){
            return -1;
        }
        String temporary = Long.toString(number);
        String result = "";
        for (int i = 0; i < temporary.length(); i++) {
            result += temporary.charAt(temporary.length() - 1 - i);
        }
        return Long.parseLong(result);
    }


    /** Метод для переворота натурального числа без строки
     *  @param number - натуральное
     *  @return возвращает перевернутое число, -1 если передано ненатуральное числа
     */
    public static long toNumberReverseWithoutString (long number) {
        if(number < 1){
            return -1;
        }
        long tempNumber = number;
        long result = 0;
        while (tempNumber > 0) {
            result = result * 10 + (tempNumber % 10);
            tempNumber /= 10;
        }
        return result;
    }


    /** Метод для вывода массива в консоль
     *  @param array - массив
     */
    public static void printArray(int [] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
    }


    static class Task1_5_1 {
        public static void main(String[] args) {
            System.out.println("Найти наибольшую цифру натурального числа");
            int number;
            boolean checkNaturalNum;

            do {
                System.out.println("Введите натуральное число, чтобы найти наибольшую цифру числа");
                number = console.nextInt();
                checkNaturalNum = number < MIN_NATURAL_NUMBER;
                if (checkNaturalNum){
                    System.out.println("Вы ввели неверное число. Введите от 1 и больше");
                }
            } while (checkNaturalNum);

            int result = getMaxDigit(number);
            if(result == -1) {
                System.out.println("С такими числами не работает");
            }
            System.out.println("В числе " + number + " максимальна цифра " + result);
        }
    }


    static class Task1_5_2 {
        public static void main(String[] args) {
            System.out.println("Вероятность четных случайных чисел");
            double result = checkRandomGenerator(RANDOM_VALUE);
            System.out.println("Процент четных чисел в выборке из " + RANDOM_VALUE + " составляет " + result);
        }
    }


    static class Task1_5_3 {
        public static void main(String[] args) {
            System.out.println("Посчитать четные и нечетные цифры числа");
            int number;
            boolean checkNaturalNum;

            do {
                System.out.println("Введи натуральное число, чтобы посчитать четные и нечетные цифры числа");
                number = console.nextInt();
                checkNaturalNum = number < MIN_NATURAL_NUMBER;
                if (checkNaturalNum){
                    System.out.println("Вы ввели неверное число. Введите от 1 и больше");
                }
            } while (checkNaturalNum);

            int sumEven = countEvenDigit(number);
            int sumOdd = countOddDigit(number);
            System.out.println("В числе " + number + " четных чисел: " + sumEven + ", нечетных чисел: " + sumOdd);
        }
    }


    static class Task1_5_4 {
        public static void main(String[] args) {
            System.out.println("Вывести ряд Фибоначчи");
            int numberFib;
            boolean checkNaturalNum;

            do {
                System.out.println("Введите число для ряда Фибоначчи");
                numberFib = console.nextInt();
                checkNaturalNum = numberFib < MIN_NATURAL_NUMBER;
                if (checkNaturalNum){
                    System.out.println("Вы ввели неверное число. Введите от 1 и больше");
                }
            } while (checkNaturalNum);

            int [] array = fibonacci(numberFib);
            if(array.length == 0) {
                System.out.println("Введены некорректные данные");
            } else {
                printArray(array);
            }
        }
    }


    static class Task1_5_5 {
        public static void main(String[] args) {
            System.out.println("Вывести на экран ряд натуральных чисел от минимума до максимума с шагом");
            int startRow;
            int finishRow;
            int step;
            boolean checkNaturalNum;

            do {
                System.out.println("Введите начальное число");
                startRow = console.nextInt();
                System.out.println("Введите конечное число");
                finishRow = console.nextInt();
                System.out.println("Введите шаг");
                step = console.nextInt();

                checkNaturalNum = startRow < MIN_NATURAL_NUMBER || finishRow < MIN_NATURAL_NUMBER || step < MIN_NATURAL_NUMBER || startRow > finishRow;
                if (checkNaturalNum){
                    System.out.println("Вы ввели неверное число. Введите числа от 1 и больше и начальное значение меньше конечного");
                }
            } while (checkNaturalNum);

            int[] result = getRowOfNumbers(startRow, finishRow, step);
            printArray(result);
        }
    }


    static class Task1_5_6 {
        public static void main(String[] args) {
            System.out.println("Переворот числа");
            long numberReverse;
            boolean checkNaturalNum;

            do {
                System.out.println("Введите натуральное число, из которого необходимо получить обратное число");
                numberReverse = console.nextLong();
                checkNaturalNum = numberReverse < MIN_NATURAL_NUMBER;
                if (checkNaturalNum){
                    System.out.println("Вы ввели неверное число. Введите от 1 и больше");
                }
            } while (checkNaturalNum);

            long result = toNumberReverse(numberReverse);
            System.out.println("Число " + numberReverse + " после переворота имеет вид " + result);

            long result2 = toNumberReverseWithoutString(numberReverse);
            System.out.println("Число " + numberReverse + " после переворота имеет вид " + result2);
        }
    }
}
