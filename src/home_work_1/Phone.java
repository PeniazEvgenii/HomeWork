package home_work_1;

public class Phone {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String pnoneNum = createPhoneNumber(mass);
        System.out.println(pnoneNum);
    }
    public static String createPhoneNumber (int [] arr) {
        String format = "(";

        for (int i = 0; i < arr.length - 1; i++) {     // исправить. почему-то с 1
            if (i >= 0 && i <= 2) {
                System.out.println(arr[i]);
                format += arr[i];
                if (i == 2) {
                    format += ") ";
                }
            }

            if (i >= 3 && i <= 5) {
                format += arr[i];
                if (i == 5) {
                    format += "-";
                }
            }

            if (i >= 6 && i <= 9) {
                format += arr[i];
            }
        }

        return format;
    }
}
