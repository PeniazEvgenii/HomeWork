package home_work_5.comparator;

import home_work_5.Animal;

import java.util.Comparator;

public class ComparatorByAgeAnimal implements Comparator<Animal> {

    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getAge() - a2.getAge();
    }
}
