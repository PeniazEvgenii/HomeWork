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

        Scanner console = new Scanner(System.in);
        int count;
        do {
            System.out.println("Введите номер для вывода TOP слов");
            count = console.nextInt();
            if(!checkInput(count)) {
                System.out.println("Введите номер от 1 и выше");
            }
        } while(!checkInput(count));

        String result = getTopString(fromFile, count);
        System.out.println(result);


    }

    /**
     * метод проверки введеннго числа
     * @param count число
     * @return true если count от 1 и выше, false если count меньше 1
     */
    public static boolean checkInput(int count) {
        return count >= 1;
    }

    /**
     * Метод получения строки из наиболее часто встречающихся слов
     * @param fromFile анализируемая строка
     * @param count количество слов
     * @return строка со словами и количеством их в тексте
     */
    public static String getTopString(String fromFile, int count) {
        Map<String, Integer> map = UtilString.getAllWordsWithCount(fromFile);

        List<Map.Entry<String, Integer>> topWords = UtilString.getTopWords(map, count);

        StringBuilder stringBuilder = new StringBuilder();
        int num = 1;
        boolean first = true;
        for (Map.Entry<String, Integer> word : topWords) {
            if(first){
                first = false;
            } else {
                stringBuilder.append("\n");
            }
            stringBuilder.append(num++).append("). ").append(word);
        }
        return stringBuilder.toString();
    }
}
