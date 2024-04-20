package home_work_5.comparator;

import home_work_5.Person;

import java.util.Comparator;

public class ComparatorByPassThanNick implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getPassword().length() == p2.getPassword().length()){
            return p1.getNick().compareTo(p2.getNick());
        }
        return p1.getPassword().length() - p2.getPassword().length();
    }
}
