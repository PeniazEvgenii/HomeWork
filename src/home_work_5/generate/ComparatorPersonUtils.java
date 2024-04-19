package home_work_5.generate;

import home_work_5.Person;

public class ComparatorPersonUtils {

    public static int compareByLengthPass(Person p1, Person p2) {
        return p1.getPassword().length() - p2.getPassword().length();
    }


    public static int compare(Person p1, Person p2) {
        if (p1.getPassword().length() == p2.getPassword().length()){
            return p1.getNick().compareTo(p2.getNick());
        }
            return p1.getPassword().length() - p2.getPassword().length();
    }
}
