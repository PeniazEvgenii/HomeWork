package home_work_2.loops;

/*
 * 1.5. Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах.
 *  	 1.5.1. Найти наибольшую цифру натурального числа
 *  	 1.5.2. Вероятность четных случайных чисел
 *  	 1.5.3. Посчитать четные и нечетные цифры числа
 *  	 1.5.4. Ряд Фибоначчи
 *  	 1.5.5. Вывести ряд чисел в диапазоне с шагом
 *  	 1.5.6. Переворот числа
 */

import java.util.Scanner;

public class Task1_5 {
   static Scanner console = new Scanner(System.in);

    public static final int MIN_NATURAL_NUMBER = 1;

    public static void main(String[] args) {
      getMaxDigit();
      System.out.println("");

      checkRandomGenerator();
      System.out.println("");

      countOddEvenDigit();
      System.out.println("");

      fibonacci();
      System.out.println("");

      getRowOfNumbers();
      System.out.println("");

      toNumberReverse ();
      System.out.println("");

      toNumberReverseTest();
    }

    public static void getMaxDigit() {
        System.out.println("Найти наибольшую цифру натурального числа");
        int number;
        boolean checkNaturalNum;
        do {
            System.out.println("Введи натуральное число, чтобы найти наибольшую цифру числа");
            number = console.nextInt();
            checkNaturalNum = number < MIN_NATURAL_NUMBER;
            if (checkNaturalNum){
                System.out.println("Вы ввели неверное число. Введите от 1 и больше");
            }
        } while (checkNaturalNum);

        int numberPrint = number;
        int maxDigit = number % 10;
        while (number > 0) {
            if (maxDigit < number % 10) {
                maxDigit = number % 10;
            }
            number /= 10;
        }
       System.out.println("В числе " + numberPrint + " максимальна цифра " + maxDigit);
    }


    public static void checkRandomGenerator() {
        System.out.println("Вероятность четных случайных чисел");
        int valueEvenNumber = 0;
        int randomSample = 10_000;
        int currentLoop = 0;
        while (randomSample > currentLoop) {
            int random = (int)(Math.random()*100);
            if (random % 2 == 0) {
                valueEvenNumber++;
            }
            currentLoop++;
        }
        double percentEven = (valueEvenNumber * 100.0) / randomSample;
        System.out.println("Процент четных чисел в выборке из " + randomSample + " составляет " + percentEven);
    }


    public static void countOddEvenDigit() {
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

        int valueEven = 0;
        int valueOdd = 0;
        int currentNumber = number;

        while (currentNumber > 0) {
            if ((currentNumber % 10) % 2 == 0) {
                valueEven++;
            } else {
                valueOdd++;
            }
            currentNumber /= 10;
        }

        System.out.println("колличество четных цифр в числе " + number + " = " + valueEven);
        System.out.println("колличество нечетных цифр в числе " + number + " = " + valueOdd);
    }


    public static void fibonacci (){
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

        int fib1 = 1;
        int fib2 = 2;
        int currentFib;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(fib1 + " " + fib2);
        int sequenceNumber = 3;

        while (numberFib >= sequenceNumber){
            currentFib = fib1 + fib2;
            stringBuffer.append(" " + currentFib);
            fib1 = fib2;
            fib2 = currentFib;
            sequenceNumber++;
        }
        System.out.println(stringBuffer.toString());
    }


    public static void getRowOfNumbers (){
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

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = startRow; i <= finishRow; i += step) {
            stringBuffer.append(i + " ");
        }
        String row = stringBuffer.toString();
        System.out.println(row);
    }


    public static void toNumberReverse () {
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

        String temporary = Long.toString(numberReverse);
        String result = "";
        for (int i = 0; i < temporary.length(); i++) {
            result += temporary.charAt(temporary.length() - 1 - i);
        }
        System.out.println(result);
    }


    public static void toNumberReverseTest () {
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

        long tempNumber = numberReverse;
        long ne = 0;

        while (tempNumber > 0) {
            ne = ne * 10 + (tempNumber % 10);
            tempNumber /= 10;
        }
        System.out.println(ne);
    }
}