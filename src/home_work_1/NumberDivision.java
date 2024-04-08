package home_work_1;

import java.util.Scanner;

public class NumberDivision {
    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введи делимое число");
        int firstNum = getCheckInt();
        System.out.println("Введи делитель");
        int secondNum = getCheckInt();

        boolean result = getResultDivision(firstNum, secondNum);
        if(result){
            System.out.println("числа деляться без остатка" );
        } else {
            System.out.println("числа не деляться без остатка");
        }
    }

    /**
     * Метод проверки делимости без остатка одного числа на другое
     * @param firstNum делимое
     * @param secondNum делитель
     * @return true - числа деляться без остатка, false - не делятся без остатка
     */
    public static boolean getResultDivision(int firstNum, int secondNum) {
        if (secondNum == 0) {
            return false;
        }
        return firstNum % secondNum == 0;
    }


    /**
     * Метод ввода числа типа int
     * @return введенное с консоли число
     */
    public static int getCheckInt () {
        int temp;

        if (console.hasNextInt()) {
            temp = console.nextInt();
        } else {
            System.out.println("Вы ввели неверное значение. Попробуйте еще раз");
            console.next();  // без метода next произошло зацикливание next считывает строку до перого пробела
            temp = getCheckInt();
        }

        return temp;
    }
}
