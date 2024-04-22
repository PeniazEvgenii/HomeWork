package home_work_5.generate;

import java.util.concurrent.ThreadLocalRandom;

public class AgeGenerate {

    /**
     * Метод генерации случайного числа в диапазоне [1,15]
     * @return случайное число
     */
    public static int getAge() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        return rnd.nextInt(1, 16);
    }
}
