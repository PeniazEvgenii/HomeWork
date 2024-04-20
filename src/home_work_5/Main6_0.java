package home_work_5;

import home_work_5.utils.AdditionCollections;
import home_work_5.utils.ComparatorUtils;

import java.io.IOException;
import java.util.*;

import static home_work_5.utils.OperationsOfCollect.getStringResult;
import static home_work_5.utils.OperationsOfCollect.operationsOfCollect;


public class Main6_0 {
    public static void main(String[] args) throws IOException {
       List<Person> personArrayList = new ArrayList<>();
       List<Person> personLinkedList = new LinkedList<>();
       Set<Person> personHashSet = new HashSet<>();
       Set<Person> personTreeSet = new TreeSet<>(ComparatorUtils::compare);

       long timeAddArray = AdditionCollections.addCollectionPerson(personArrayList);
       System.out.print(getStringResult("Заполнение ArrayList", timeAddArray));
       System.out.println(operationsOfCollect(personArrayList, ComparatorUtils::compare));

       long timeAddLinked = AdditionCollections.addCollectionPerson(personLinkedList);
       System.out.print(getStringResult("Заполнение LinkedList", timeAddLinked));
       System.out.println(operationsOfCollect(personLinkedList, ComparatorUtils::compare));

       long timeAddHashSet = AdditionCollections.addCollectionPerson(personHashSet);
       System.out.print(getStringResult("Заполнение HashSet", timeAddHashSet));
       System.out.println(operationsOfCollect(personHashSet, ComparatorUtils::compare));

       long timeAddTreeSet = AdditionCollections.addCollectionPerson(personTreeSet);
       System.out.print(getStringResult("Заполнение TreeSet", timeAddTreeSet));
       System.out.println(operationsOfCollect(personTreeSet, ComparatorUtils::compare));

       // SortCollection.sort(personArrayList, new ComparatorByPassThanNick());
       // personArrayList.forEach(System.out::println);
    }





}
