package home_work_5.generate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

public class NickGenerate {

    /**
     * Метод получения никнейма из существующего файла
     * @return строка со случайным никнеймом
     */
    public static String getNickFromFile() {
        Random random = new Random();
        Path path = Path.of("HomeWork", "src", "home_work_5", "generate", "resourses", "nick.txt");
        String name = "";
        try {
            List<String> names = Files.readAllLines(path);
            name = names.get(random.nextInt(names.size()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return name;
    }
}
