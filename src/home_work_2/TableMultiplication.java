package home_work_2;

public class TableMultiplication {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 9 ; j++) {

                System.out.print( j+" * " +i + " = "+ i*j + "\t\t");
                if (j==9) {
                    System.out.println("");
                }

            }

            
        }
    }
}
