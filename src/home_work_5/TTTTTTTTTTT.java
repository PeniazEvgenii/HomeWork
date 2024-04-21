package home_work_5;

import home_work_5.comparator.ComparatorByPassLength;

import java.util.*;
import java.util.stream.Collectors;

public class TTTTTTTTTTT {
    public static void main(String[] args) {
        Set<Animal> set = new HashSet<>();
        set.add(new Animal("dssdsdsdd",14));
        set.add(new Animal("dssdst",14));
        set.add(new Animal("dssdse",13));
        set.add(new Animal("dssds",12));
        set.add(new Animal("dssds",14));
        set.add(new Animal("dssdsrrr",12));
        set.add(new Animal("rrrdssds",12));

        System.out.println(set.size());

        Set<Animal> set2 = new TreeSet<>(Comparator.comparing(Animal::getAge).thenComparing(Animal::getNick));
        set2.addAll(set);
        System.out.println(set2);
        System.out.println(set2.size());


    }
}
