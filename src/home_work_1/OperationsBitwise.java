package home_work_1;

import java.util.Scanner;

public class OperationsBitwise {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введи первое число"); // десятичное число (Dec) 13 в двоичной системе счисления (Bin) 00001101
        int first = console.nextInt();
        System.out.println("Введи второе число"); // десятичное число (Dec) 33 в двоичной системе счисления (Bin) 00100001
        int second = console.nextInt();

        int resultAnd = first & second;
        /*
        * Значения переменных first и second переводятся в двоичную систему, затем два значения сравниваются по битам.
        * Результат каждого сравнения будет равен 1 только в случае если оба бита равны 1. После сравнения получено двоичное число 00000001.
        * Это число переводится в десятичную систему счисления, где оно равно 1. Результат присваивается переменной resultAnd.
        */

        int resultOr = first | second;
        /*
         * Значения переменных first и second переводятся в двоичную систему, затем два значения сравниваются по битам.
         * Результат каждого сравнения будет равен 1 в случа если хотя бы один из сравниваемых битов равен 1.
         * После сравнения получено двоичное число 00101101.
         * Это число переводится в десятичную систему счисления, где оно равно 45. Результат присваивается переменной resultOr.
         */

        System.out.println("Результат операции побитовое И: " + resultAnd);
        System.out.println("Результат операции побитовое ИЛИ: " + resultOr);

        /*
        При попытке сделать побитовую операцию с литералом 42.5, наример ~42.5, среда разработки указывает на проблему, что оператор '~' не может быть
        применет к типу double. При компиляции появляется сообщение, что неверный тип double операнда для унарного оператора '~'. Аналогичные проблемы
        возникают и с другими побитовыми операторами.
         */
    }
}
