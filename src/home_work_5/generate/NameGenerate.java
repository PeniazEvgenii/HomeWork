package home_work_5.generate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;


public class NameGenerate {
    public static final List<String> NAMES_OF_PEOPLE = List.of("Алексей", "Андрей", "Артемий", "Виктор", "Никита", "Даниил", "Денис", "Егор", "Игорь", "Лев", "Сергей", "Дмитрий", "Илья");

    // public static Random random = new Random();

    /**
     * Метод получения случайного реального имени из списка имен {@link #NAMES_OF_PEOPLE}
     *
     * @return строка с именем
     */
    public static String getRealRusName() {
        Random random = new Random();
        return NAMES_OF_PEOPLE.get(random.nextInt(NAMES_OF_PEOPLE.size()));
    }

    /**
     * Метод получения случайного мужского или женского имени из существующих файлов
     * @return строка со случайным именем
     */
    public static String getRusNameFromFile() {
        Random random = new Random();
        Path male = Path.of("HomeWork", "src", "home_work_5", "generate", "resourses", "maleNames.txt");
        Path female = Path.of("HomeWork", "src", "home_work_5", "generate", "resourses", "femaleNames.txt");
        Path path;
        if (random.nextInt(2) == 1) {
            path = male;
        } else {
            path = female;
        }
        String name = "";
        try {
            List<String> names = Files.readAllLines(path);
            name = names.get(random.nextInt(names.size()));
        } catch (IOException e) {
            e.printStackTrace();    // не пробрасывал дальше
        }
        return name;
    }





}
