package home_work_5.comparator;

import home_work_5.Person;

import java.util.Comparator;

public class ComparatorByPassLength implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getPassword().length() - p2.getPassword().length();
    }
}
