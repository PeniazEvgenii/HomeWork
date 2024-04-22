package home_work_5.generate;


import java.util.Random;
import java.util.stream.Collectors;

public class StringGenerate {
    public static final String RUSSIAN_ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";


    /**
     * Метод получения строки из случайного набора символов (таблица ASCII [48-122] символы)
     * @return случайная строка длиной 10 символов
     */
    public static String getStringAllRandom() {
        Random random = new Random();
        String name = random.ints(48, 122)
                .limit(10)
                .mapToObj(p -> (char) p)
                .map(Object::toString)
                .collect(Collectors.joining());
        return name;
    }

    /**
     * Метод получения строки из русских символов, не включая 'ё', 'Ё'
     * @return строка русских символов длиной 10 символов
     */
    public static String getStringRusCharRandom() {
        Random random = new Random();
        int sizeString = 10;
        return random.ints('А', 'я')
                .limit(sizeString)
                .mapToObj(p -> (char) p)
                .map(Object::toString)
                .collect(Collectors.joining());
    }

    /**
     * Метод получения строки из набора русских символов {@link #RUSSIAN_ALPHABET}
     * @return строка русских символов длиной 10 символов
     */
    public static String getStringRusAlphabetRandom() {
        Random random = new Random();
        int sizeString = 10;
        return random.ints(sizeString, 0, RUSSIAN_ALPHABET.length())
                .mapToObj(RUSSIAN_ALPHABET::charAt)
                .map(Object::toString)
                .collect(Collectors.joining());
    }

    /**
     * Метод получения строки из анлийских букв
     * @return строка русских символов длиной 10 символов
     */
    public static String getStringEngCharRandom() {
        Random random = new Random();
        int sizeString = 10;
        return random.ints(65, 123)
                .filter(p -> p < 90 || p > 96)
                .limit(sizeString)
                .mapToObj(p -> (char) p)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

}
