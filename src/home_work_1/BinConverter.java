package home_work_1;

import java.util.Scanner;

public class BinConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число от -128 до 127");
        byte number = console.nextByte();
        System.out.println(number);

        System.out.println(toBinaryString(number));
    }

    public static String toBinaryString (byte number) {
        String bin = "";
        boolean minus = number < 0;
        System.out.println(minus);  

        int temp = Math.abs(number);

        for (int i = 0; temp > 1 ; i++) {
            bin = temp % 2 + bin;
            temp = temp / 2;           // ругается на тип byte  (правило 4 ? два любых привод к int? )
        }
        bin = temp + bin;             // последний остаток

        for (int i = 0; i < 7; i++) {   // дополним нулями до  7 бит
            if (bin.length() <= i) {
                bin = "0" + bin;
            }
        }

        if (!minus) {
            bin =  "0" + bin;
        } else {
            bin = "1" + bin.replace('1','2').replace('0','1').replace('2','0'); // обратный код
        }


        return bin;
    }
}
