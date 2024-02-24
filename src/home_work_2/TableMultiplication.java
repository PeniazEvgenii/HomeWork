package home_work_2;

public class TableMultiplication {
    public static final int MIN_FIRST_NUMBER = 1;
    public static final int MAX_FIRST_NUMBER = 10;
    public static final int MIN_SECOND_NUMBER = 2;
    public static final int MAX_SECOND_NUMBER = 9;

    public static void main(String[] args) {

        for (int i = MIN_FIRST_NUMBER; i <= MAX_FIRST_NUMBER; i++) {
            for (int j = MIN_SECOND_NUMBER; j <= 5 ; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t\t");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = MIN_FIRST_NUMBER; i <= MAX_FIRST_NUMBER; i++) {
            for (int j = 6; j <= MAX_SECOND_NUMBER ; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t\t");
            }
            System.out.println("");
        }
    }
}
