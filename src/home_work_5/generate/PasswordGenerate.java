package home_work_5.generate;

import java.util.concurrent.ThreadLocalRandom;

public class PasswordGenerate {

    public static String getPassword() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        return String.valueOf(rnd.nextLong(10_000, 9_999_999_999L));
    }
}
