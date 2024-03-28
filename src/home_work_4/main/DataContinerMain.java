package home_work_4.main;

import home_work_4.ComparatorForNumber;
import home_work_4.ComparatorForStringLength;
import home_work_4.DataContainer;

import java.util.*;

public class DataContinerMain {
    public static void main(String[] args) {
        Integer[] array2 = {1, 2, 3, null, null, null};
        Integer[] array3 = {1, null, 3, null, null, null};
        Integer[] array4 = {1, 2, 3};
        Integer[] array5 = {};
        String[] aaa = {};


        DataContainer<Integer> data = new DataContainer<>(array3);
        DataContainer<String> data1 = new DataContainer<>(aaa);
       System.out.println(data.add(44666));
       System.out.println(data.add(10));
       System.out.println(data.add(4333));
       System.out.println(data.add(5434));
       System.out.println(data.add(722));
       System.out.println(data.add(333));
       System.out.println(data.add(990));
       System.out.println(data.add(111));
       System.out.println(data.add(777));
       System.out.println(data.add(12));
        System.out.println(data1.add("приветССССЫВА"));
        System.out.println(data1.add(" "));
        System.out.println(data1.add("Дядя"));
        System.out.println(data1.add(" "));
        System.out.println(data1.add("Вася"));


        System.out.println(Arrays.toString(data.getItems()));
       // System.out.println(data.delete(1));
        // System.out.println(data1.delete(" "));
        System.out.println(Arrays.toString(data.getItems()));

        ComparatorForNumber comparator = new ComparatorForNumber();
        data.sort(comparator);
        System.out.println(Arrays.toString(data.getItems()));


        Double[] test = {};
        DataContainer<Double> PPP = new DataContainer<>(test);
        System.out.println(PPP.add(44666.44));
        System.out.println(PPP.add(10.332));
        System.out.println(PPP.add(4333.32423));
        System.out.println(PPP.add(5434.3242254));
        System.out.println(PPP.add(722.4353));
        System.out.println(PPP.add(333.3434));
        System.out.println(PPP.add(990.3434));
        System.out.println(PPP.add(111.34344));
        System.out.println(PPP.add(777.31));
        System.out.println(PPP.add(12.000));
        System.out.println(data1.add("приветПукxет"));
        System.out.println(data1.add("1"));
        System.out.println(data1.add("Дядя332"));
        System.out.println(data1.add(" "));
        System.out.println(data1.add("Васяt"));
        System.out.println(data1.add("Васяdfdf"));
        System.out.println(data1.add("Ва2"));

        System.out.println("печать старь   " + data1);
        ComparatorForStringLength comparatorForStringLength = new ComparatorForStringLength();
        data1.sort(comparatorForStringLength);
        System.out.println("печать новый   " + data1);

        System.out.println(PPP);
        System.out.println(PPP.delete(12.0));
        System.out.println(PPP);
        List<String> list = new ArrayList<>();
        ComparatorForNumber comparator2 = new ComparatorForNumber();
        ///PPP.sort(comparator2);
        System.out.println(PPP);
       // DataContainer.sort(PPP);

        DataContainer.sort(PPP, comparator2);
        System.out.println(PPP);


    }
}
