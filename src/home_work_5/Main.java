package home_work_5;

import home_work_5.generate.ComparatorPersonUtils;

import java.io.IOException;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        Person person = new Person("ffff", "12345888", "fdfd");
        Person person2 = new Person("ffd", "1234677", "fdfd");
        Person person3 = new Person("bfff", "123476", "fdfd");
        Person person4 = new Person("cfff", "123487", "fdfd");
        Person person5 = new Person("afff", "123481", "fdfd");
        Person person6 = new Person("cbfff", "1234811111", "fdfd");
        Person person7 = new Person("ebfff", "1234811111", "fdfd");
        Person person8 = new Person("ebffa", "1234811111", "fdfd");
        Person person9 = new Person("ebffc", "1234811111", "fdfd");
        Person person10 = new Person("ebffb", "1234811111", "fdfd");
        Person person11 = new Person("ebffv", "1234811111", "fdfd");

        List<Person> people = new java.util.ArrayList<>();
        people.add(person);
        people.add(person4);
        people.add(person2);
        people.add(person3);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);
        people.add(person11);
        people.sort(ComparatorPersonUtils::compare);

        people.forEach(System.out::println);

      //  System.out.println(StringGenerate.getStringAllRandom());
      //  System.out.println(StringGenerate.getStringRusCharRandom());
      //  System.out.println(StringGenerate.getStringRusAlphabetRandom());
      //  System.out.println(NameGenerate.getRealRusName());
      //  System.out.println(NameGenerate.getRusNameFromFile());
      //  System.out.println(StringGenerate.getStringEngCharRandom());
      //  System.out.println(NameAnimalGenerate.getNameAnimalFromFile());
      //  System.out.println(NameAnimalGenerate.getRealNameForAnimal());
      //  System.out.println(NickGenerate.getNickFromFile());




    }
}
