package home_work_5.utils;

import home_work_5.Animal;
import home_work_5.Person;
import home_work_5.generate.*;

import java.util.Collection;

public class AdditionCollections {

    /**
     * Метод заполнения коллекции объектами Person в количестве 100_000
     * @param collect коллекци для заполнения
     */
    public static long addCollectionPerson(Collection<Person> collect){
        boolean b;
        long start = System.currentTimeMillis();
        for(int i = 0; i < 100_000; i++) {
            b = collect.add(new Person(StringGenerate.getStringEngCharRandom(), PasswordGenerate.getPassword(), NameGenerate.getRusNameFromFile()));
            System.out.println(b);
            if (!b) {
                i--;
            }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    /**
     * Метод заполнения коллекции объектами Animal в количестве 100_000
     * @param collect коллекци для заполнения
     */
    public static void addCollectionAnimal(Collection<Animal> collect){
        boolean b;
        for(int i = 0; i < 100_000; i++) {
            b = collect.add(new Animal(NameAnimalGenerate.getNameAnimalFromFile(), AgeGenerate.getAge()));
             if (!b) {
                 i--;
             }
        }
    }


}
