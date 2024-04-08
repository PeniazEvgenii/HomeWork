package home_work_1;

public class NumberOdd {
    public static boolean debugMode = false;

    public static void main(String[] args) {
        isDebugMode(args);
        int firstNum = (int)(Math.random() * 50 + 1);
        int secondNum = (int)(Math.random() * 50 + 1);

        if (debugMode) {
            System.out.println("Выведем рандомные числа");
            System.out.println(firstNum);
            System.out.println(secondNum);
        }

        if ((firstNum % 2 == 0 && secondNum % 2 == 0) || (firstNum % 2 != 0 && secondNum % 2 != 0)) {
            firstNum++;
        }

        System.out.println("нечетное число " + checkNumberOdd(firstNum, secondNum));
    }

    /**
     * Метод нахождения нечетного числа
     * @param firstNum первое число
     * @param secondNum второе число
     * @return четное число
     */
    public static int checkNumberOdd(int firstNum, int secondNum){
        return firstNum % 2 != 0 ? firstNum : secondNum;
    }


    public static void isDebugMode (String [] array) {
        for (String ar : array) {
            if ("debug".equalsIgnoreCase(ar)) {
                debugMode = true;
                break;
            }
        }
    }
}
