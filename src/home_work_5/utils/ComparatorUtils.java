package home_work_5.utils;

import home_work_5.Animal;
import home_work_5.Person;

public class ComparatorUtils {

    public static int compareByLengthPass(Person p1, Person p2) {
        return p1.getPassword().length() - p2.getPassword().length();
    }


    public static int compare(Person p1, Person p2) {
        if (p1.getPassword().length() == p2.getPassword().length()){
            return p1.getNick().compareTo(p2.getNick());
        }
            return p1.getPassword().length() - p2.getPassword().length();
    }


    public static int compareByAge(Animal a1, Animal a2) {
        return a1.getAge() - a2.getAge();
    }


    public static int compare(Animal a1, Animal a2) {
        if (a1.getAge() == a2.getAge()){
            return a1.getNick().compareTo(a2.getNick());
        }
        return a1.getAge() - a2.getAge();
    }
}
