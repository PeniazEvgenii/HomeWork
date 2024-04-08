package home_work_1;

public class Phone {
    public static void main(String[] args) {
        int[] mass = {1,2,3,4,5,6,7,8,9,0};
        String phoneNum = createPhoneNumber(mass);
        System.out.println(phoneNum);
    }

    /**
     * Метод вывода отформатированного номера
     * @param arr массив с числами
     * @return номер в формате (123) 456-7890
     */
    public static String createPhoneNumber (int [] arr) {
        String format = "(";

        for (int i = 0; i < arr.length; i++) {
            if (i >= 0 && i <= 2) {
                format += arr[i];
                if (i == 2) {
                    format += ") ";
                }
            } else if (i >= 3 && i <= 5) {
                format += arr[i];
                if (i == 5) {
                    format += "-";
                }
            } else if (i >= 6 && i <= 9) {
                format += arr[i];
            }
        }
        return format;
    }
}
