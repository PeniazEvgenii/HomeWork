package home_work_4.test;

import home_work_4.ComparatorForNumber;
public class DataContainerTestMain {
    public static void main(String[] args) {

        Integer[] a = {null, null, 5,6,null,10,null, null, null};

        DataContainerTest<Integer> cont = new DataContainerTest<>(a);
        System.out.println(cont);
        System.out.println(cont.add(13));
        System.out.println(cont.add(11));
        System.out.println(cont.add(12));
        cont.add(130);
        cont.add(101);
        cont.add(12);
        cont.add(15223);
        cont.add(1134);
        cont.add(12);
        cont.add(1243);
        cont.add(13);
        cont.add(122);
        cont.add(99);
        cont.add(12);
        cont.add(3);
        System.out.println(cont.add(null));              // вернул -1
        cont.add(1422);
        System.out.println(cont.get(2));

        System.out.println(cont);

        System.out.println(cont.delete(Integer.valueOf(13)));

        cont.sort(new ComparatorForNumber());
        //DataContainerTest.sort(cont);
        //DataContainerTest.sort(cont, new ComparatorForNumber());
        System.out.println("отсортированный массив " + cont);
        for (Integer integer : cont) {
            System.out.print(integer + " |");
        }
        System.out.println();
    }
}
