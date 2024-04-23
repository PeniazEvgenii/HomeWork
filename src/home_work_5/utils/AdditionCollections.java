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
        long start = System.currentTimeMillis();
        for(int i = 0; i < 100_000; i++) {
            collect.add(new Person(StringGenerate.getStringEngCharRandom(), PasswordGenerate.getPassword(), NameGenerate.getRusNameFromFile()));
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    /**
     * Метод заполнения коллекции объектами Animal в количестве 100_000
     * @param collect коллекци для заполнения
     */
    public static long addCollectionAnimal(Collection<Animal> collect){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 100_000; i++) {
            collect.add(new Animal(NameAnimalGenerate.getNameAnimalFromFile(), AgeGenerate.getAge()));
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

}
