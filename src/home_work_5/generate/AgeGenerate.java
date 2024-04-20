package home_work_5.generate;

import java.util.concurrent.ThreadLocalRandom;

public class AgeGenerate {

    public static int getAge() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        return rnd.nextInt(1, 16);
    }
}
