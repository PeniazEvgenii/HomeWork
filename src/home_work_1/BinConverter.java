package home_work_1;

import java.util.Scanner;

public class BinConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число от -128 до 127");
        byte number;

        if (console.hasNextByte()) {
            number = console.nextByte();
            System.out.println("двоичное представление числа " + number + " составляет " + toBinaryString(number));
        } else {
            System.out.println("Введено число не входящее в интервал от -128 до 127. Запустите программу заново");
            System.exit(0);
        }

    }

    public static String toBinaryString (byte number) {
        String bin = "";
        boolean minus = number < 0;
        int temp;

        if (minus) {
            temp = 256 + number;
        } else {
            temp = number;
        }

        for (int i = 0; temp > 1 ; i++) {
            bin = temp % 2 + bin;
            temp = temp / 2;
        }
        bin = temp + bin;

        for (int i = 0; i < 8; i++) {
            if (bin.length() <= i) {
                bin = "0" + bin;
            }
        }

        return bin;
    }
}
