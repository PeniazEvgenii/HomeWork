package home_work_5.generate;

import home_work_5.Animal;
import home_work_5.Person;


public class ComparatorAnimalUtils {
    public static int compareByLengthPass(Animal a1, Animal a2) {
        return a1.getAge() - a2.getAge();
    }


    public static int compare(Animal a1, Animal a2) {
        if (a1.getAge() == a2.getAge()){
            return a1.getNick().compareTo(a2.getNick());
        }
        return a1.getAge() - a2.getAge();
    }
}
