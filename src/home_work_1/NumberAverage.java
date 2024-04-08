package home_work_1;

import java.util.Scanner;

public class NumberAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите три различных числа");

        int firstNum = console.nextInt();
        int secondNum = console.nextInt();
        int thirdNum = console.nextInt();
        int avg = average(firstNum, secondNum, thirdNum);

        System.out.println("Среднее число: " + avg);
    }

    /**
     * Метод нахождения числа, имеющего среднего значения среди трех числе
     * @param firstNum первое число
     * @param secondNum второе число
     * @param thirdNum третье число
     * @return число, имеющее среднее значение
     */
    public static int average(int firstNum, int secondNum, int thirdNum) {
        if ((firstNum > secondNum && firstNum < thirdNum) || (firstNum < secondNum && firstNum > thirdNum)) {
            return firstNum;
        } else if ((secondNum > firstNum && secondNum < thirdNum) || (secondNum > thirdNum && secondNum <firstNum)) {
            return secondNum;
        } else {
            return  thirdNum;
        }
    }
}
