package home_work_2;
/*
 * Умножать число long a = 1; пока не произойдёт переполнение. В конце в консоль вывести сообщение со значением до
 * переполнения и после переполнения. Умножать на:
 *   	1.4.1. 3
 *   	1.4.2. 188
 *   	1.4.3. -19
 *      1.4.4. Да и вообще на любое целочисленное
 */

import java.util.Scanner;

public class Task1_4 {               // доделать!!!!!! тест
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введи любое целочисленное число");
        //int value = console.nextInt();
        int value = -10;
        long a = 1;

        long result = value;
        while (true){
            long temp = a;
            a = a * value;

            if ( temp != (a /value)) {
                System.out.println("переполнение");
                System.out.println(temp);
                System.out.println(a);
                break;
            }
        }


    }

}
