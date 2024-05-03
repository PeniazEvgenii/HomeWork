package home_work_6.runner;

import home_work_6.utils.UtilFile;
import home_work_6.utils.UtilString;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main2_2 {
    public static void main(String[] args) {
        File file = new File("homework/src/home_work_6/resourses/War and peace.txt");

        String fromFile = UtilFile.getStringFromFile(file);

        Map<String, Integer> map = UtilString.getAllWordsWithCount(fromFile);

        Scanner console = new Scanner(System.in);
        int count;
        do {
            System.out.println("Введите номер для вывода TOP слов");
            count = console.nextInt();
            if(!checkInput(count)) {
                System.out.println("Введите номер от 1 и выше");
            }
        } while(!checkInput(count));

        List<Map.Entry<String, Integer>> topWords = UtilString.getTopWords(map, count);

        int num = 1;
        for (Map.Entry<String, Integer> word : topWords) {
            System.out.println(num++ + "). " + word);
        }
    }

    /**
     * метод проверки введеннго числа
     * @param count число
     * @return true если count от 1 и выше, false если count меньше 1
     */
    public static boolean checkInput(int count) {
        return count >= 1;
    }
}
