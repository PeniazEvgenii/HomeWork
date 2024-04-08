package home_work_1;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число для перевода");
        int number = console.nextInt();
        console.nextLine(); // очистка буфера ввода от символа enter
        System.out.println("для превода в байты ведите: \"b\"  для перевода в килобайты: \"kb\" ");
        String str = console.nextLine();

        if ("b".equalsIgnoreCase(str)) {
            System.out.printf("%d Кб = %.1f б%n", number, kilobyteToByteConverter(number));
        } else if ("kb".equalsIgnoreCase(str)) {
            System.out.printf("%d б = %.3f Кб", number, byteToKilobyteConverter(number));
        } else {
            System.out.println("Выбрана неверная величина");
        }
    }

    /**
     * Метод конвертирования байтов в килобайты
     * @param number значение в байт
     * @return результат в килобайтах
     */
    public static double byteToKilobyteConverter(int number) {
        return number/1024.0;
    }

    /**
     * Метод конвертирования килобайтов в байты
     * @param number значение в килобайтах
     * @return результат в байтах
     */
    public static double kilobyteToByteConverter(int number) {
        return number * 1024.0;
    }
}
