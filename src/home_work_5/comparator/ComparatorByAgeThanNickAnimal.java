package home_work_5.comparator;

import home_work_5.Animal;

import java.util.Comparator;

public class ComparatorByAgeThanNickAnimal implements Comparator<Animal> {
   
    @Override
    public int compare(Animal a1, Animal a2) {
        if (a1.getAge() == a2.getAge()){
            return a1.getNick().compareTo(a2.getNick());
        }
        return a1.getAge() - a2.getAge();
    }
}
