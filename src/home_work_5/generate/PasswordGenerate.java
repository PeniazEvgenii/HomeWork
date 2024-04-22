package home_work_5.generate;

import java.util.concurrent.ThreadLocalRandom;

public class PasswordGenerate {

    /**
     * Метод генерирования пароля длиной от 5 до 10 цифр
     * @return строка сгенерированного пароля
     */
    public static String getPassword() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        return String.valueOf(rnd.nextLong(10_000, 9_999_999_999L));
    }
}
