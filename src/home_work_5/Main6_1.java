package home_work_5;

import home_work_5.comparator.ComparatorByPassLength;
import home_work_5.comparator.ComparatorByPassThanNick;
import home_work_5.utils.AdditionCollections;
import home_work_5.utils.ComparatorUtils;
import home_work_5.utils.OperationsOfCollect;
import home_work_5.utils.SortCollection;

import static home_work_5.utils.OperationsOfCollect.getStringResult;

import java.util.*;

public class Main6_1 {
    public static void main(String[] args) {
        List<Person> personArrayList = new ArrayList<>();
        List<Person> personLinkedList = new LinkedList<>();
        Set<Person> personHashSet = new HashSet<>();
        Set<Person> personTreeSet = new TreeSet<>(ComparatorUtils::compare);  //с Comarable<> по длине пароля, добавляет только с индивидуальной длинной???


        long timeAddArray = AdditionCollections.addCollectionPerson(personArrayList);
        String resAddArray = getStringResult("Заполнение коллекции", timeAddArray);
        personArrayList.sort(new ComparatorByPassLength());
        personArrayList.sort(new ComparatorByPassThanNick());
        SortCollection.sort(personArrayList, new ComparatorByPassLength());
        String result1 = operateForList(personArrayList);
        System.out.println(resAddArray + result1);

        long timeAddLinked = AdditionCollections.addCollectionPerson(personLinkedList);
        String resAddALinked = getStringResult("Заполнение коллекции", timeAddLinked);
        personLinkedList.sort(new ComparatorByPassLength());
        personLinkedList.sort(new ComparatorByPassThanNick());
        SortCollection.sort(personLinkedList, new ComparatorByPassLength());
        String result2 = operateForList(personLinkedList);
        System.out.println(resAddALinked + result2);

        long timeAddHahSet = AdditionCollections.addCollectionPerson(personHashSet);
        String resAddHashSet = getStringResult("Заполнение коллекции", timeAddHahSet);
        SortedSet<Person> personSorted = new TreeSet<>(new ComparatorByPassThanNick());
        personSorted.addAll(personHashSet);
        String result3 = operateForSet(personHashSet);
        System.out.println(resAddHashSet + result3);

        long timeAddTreeSet = AdditionCollections.addCollectionPerson(personTreeSet);
        String resAddTreeSet = getStringResult("Заполнение коллекции", timeAddTreeSet);
        String result4 = operateForSet(personTreeSet);
        System.out.println(resAddTreeSet + result4);

    }

    private static String operateForList(List<Person> personList) {
        StringBuilder sb = new StringBuilder();

        long timeIter = OperationsOfCollect.getTimeIterator(personList);
        sb.append(getStringResult("Итерирование коллекции итератором", timeIter));

        long timeIterFor = OperationsOfCollect.getTimeIteratorFor(personList);
        sb.append(getStringResult("Итерирование коллекции циклом for", timeIterFor));

        long timeClear = OperationsOfCollect.clearCollection(personList);
        sb.append(getStringResult("Удаление всех элементов коллекции", timeClear));

        return sb.toString();
    }


    private static String operateForSet(Set<Person> personSet) {
        StringBuilder sb = new StringBuilder();

        long timeIter = OperationsOfCollect.getTimeIterator(personSet);
        sb.append(getStringResult("Итерирование коллекции итератором", timeIter));

        long timeClear = OperationsOfCollect.clearCollection(personSet);
        sb.append(getStringResult("Удаление всех элементов коллекции", timeClear));

        return sb.toString();
    }


}
