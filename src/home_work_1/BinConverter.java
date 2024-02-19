package home_work_1;

import java.util.Scanner;

public class BinConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число от -128 до 127");
        byte number = console.nextByte();

        System.out.println("двоичное представление числа " + number + " состовляет " + toBinaryString(number));
    }

    public static String toBinaryString (byte number) {
        String bin = "";
        boolean minus = number < 0;
        int temp = Math.abs(number);

        for (int i = 0; temp > 1 ; i++) {
            bin = temp % 2 + bin;
            temp = temp / 2;
        }
        bin = temp + bin;

        for (int i = 0; i < 8; i++) {   // дополним нулями до 8 бит
            if (bin.length() <= i) {
                bin = "0" + bin;
            }
        }

        if (minus) {
            bin =  bin.replace('1','2').replace('0','1').replace('2','0'); // обратный код
            // как то прибавить 1 надо!!!!
            // подумать над разницей pow(2, 8)
        }


        return bin;
    }
}
