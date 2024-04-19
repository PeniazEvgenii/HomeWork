package home_work_5.generate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

public class NameAnimalGenerate {
    public static final List<String> NAMES_OF_ANIMAL = List.of("Мурка", "Зевс", "Аполон", "Бруклин", "Лео", "Зефир", "Риччи", "Умка", "Мерлин", "Молли", "Лексус", "Альфа", "Джеки","Бакс");

    /**
     * Метод получения случайного реального имени из списка имен {@link #NAMES_OF_ANIMAL}
     * @return строка с именем
     */
    public static String getRealNameForAnimal() {
        Random random = new Random();
        return NAMES_OF_ANIMAL.get(random.nextInt(NAMES_OF_ANIMAL.size()));
    }

    /**
     * Метод получения клички животного из существующего файла
     * @return строка со случайным именем
     */
    public static String getNameAnimalFromFile() {
        Random random = new Random();
        Path path = Path.of("HomeWork", "src", "home_work_5", "generate", "resourses", "animalNames.txt");
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
