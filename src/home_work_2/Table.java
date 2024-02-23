package home_work_2;

public class Table {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 5 ; j++) {
                System.out.print( j+" * " +i + " = "+ i*j + "\t\t");
            }
                System.out.println("");
        }

        System.out.println("");

        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 9 ; j++) {
                System.out.print( j+" * " +i + " = "+ i*j + "\t\t");
            }
            System.out.println("");
        }
    }



}
