package home_work_1;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Число ПИ = " + Math.PI);
        System.out.println("Число Е = " + Math.E);

        // abs возвращаемый тип зависит от аргумента
        double num1 = -2.9;
        double module1 = Math.abs(num1);
        System.out.println("модуль1 = " + module1);

        int num2 = -3;
        int module2 = Math.abs(num2);
        System.out.println("модуль2 = " + module2);

        // округления
        double num3 = 3.3333;
        long okr = Math.round(num3); //возвращает целочисл тип
        System.out.println("округление1 = " + okr);

        double okr2 = Math.floor(num3); //возвращает веществ тип
        System.out.println("округление2 = " + okr2);

        double okr3 = Math.ceil(num3);  //возвращает веществ тип
        System.out.println("округление3 = " + okr3);

        //max, min
        int maxValue = Math.max(4,5);
        System.out.println("максимальное значение = " + maxValue);

        double minValue = Math.min(Math.max(3.33, 5.55), Math.max(10.12, 4.88));
        System.out.println("минимальное значение = " + minValue);

        //случайное число
        double num4 = Math.random();
        System.out.println("случайное значение = " + num4);

        //функции степени
        double num5 = 8.0;
        double step = Math.pow(num5,3);
        System.out.println("результат1 степени" + step);

        double step1 = Math.pow(num5, 1.0/3); // корень кубический можно
        System.out.println("результат2 степени" + step1);

        double step2 = Math.sqrt(num5);
        System.out.println("результат3 степени" + step2);

        //тригонометрические функции
        double num6 = 1.8;
        double trig1 = Math.cos(num6);
        System.out.println("косинус = " + trig1);

        double trig2 = Math.sin(Math.toRadians(90));
        System.out.println("синус = " + trig2);

        double trig3 = Math.tan(Math.toRadians(45));
        System.out.println("тангес = " + trig3);

    }
}
