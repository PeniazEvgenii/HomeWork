package home_work_2;
/*
 * 1.6. Вывести таблицу умножения в консоль
 */

public class Task1_6 {
    public static final int MIN_FIRST_NUMBER = 1;
    public static final int MAX_FIRST_NUMBER = 10;
    public static final int MIN_SECOND_NUMBER = 2;
    public static final int MAX_SECOND_NUMBER = 9;
    public static final int MIDDLE_TABLE = 5;

    public static void main(String[] args) {

        for (int a = 1; a <= 2 ; a++) {
            for (int i = MIN_FIRST_NUMBER; i <= MAX_FIRST_NUMBER; i++) {
                for (int j = MIN_SECOND_NUMBER; j <= MAX_SECOND_NUMBER; j++) {

                    if (a == 1 && j <= MIDDLE_TABLE ) {
                        System.out.print(j + " * " + i + " = " + (i * j) + "\t\t");
                    }

                    if (a==2 && j > MIDDLE_TABLE){
                        System.out.print(j + " * " + i + " = " + (i * j) + "\t\t");
                    }

                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
