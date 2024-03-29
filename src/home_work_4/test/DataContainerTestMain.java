package home_work_4.test;

import home_work_4.ComparatorForNumber;
import home_work_4.DataContainer;
import home_work_4.test.dto.TimerTest;

import java.time.LocalTime;

/**
 * Проверка работы DataContainerTest c изменяемой длинной массива на заданное количество при добавлении данных
 * тестировалось 300_000 записей числа "1000" на одном и том же пк. Менялось значение в константе {@link home_work_4.DataContainer}
 * При увеличении массива на 1, время выполнения метода составило 65,22 сек
 * При увеличении массива на 10, время выполнения метода составило 24,61 сек
 * При увеличении массива на 20, время выполнения метода составило 22,42 сек
 * При увеличении массива на 50, время выполнения метода составило 19,08 сек
 * При увеличении массива на 100, время выполнения метода составило 14,1 сек
 */
public class DataContainerTestMain {
    public static void main(String[] args) {

        Integer[] a = {null, null, 5,6,null,10,null, null, null};

        DataContainerTest<Integer> cont = new DataContainerTest<>(a);
        System.out.println(cont);
        System.out.println("длина массива  " + cont.getItems().length);
        System.out.println("размер size занятый массива  " + cont.getSize());
        System.out.println(cont.add(13));
        System.out.println(cont.add(11));
        System.out.println(cont.add(12));
        System.out.println("длина массива  " + cont.getItems().length);
        System.out.println("размер size занятый массива  " + cont.getSize());
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
        System.out.println("длина массива  " + cont.getItems().length);
        System.out.println("размер size занятый массива  " + cont.getSize());
        System.out.println(cont);

        System.out.println(cont.delete(Integer.valueOf(13)));
        System.out.println(cont);
        System.out.println("длина массива  " + cont.getItems().length);
        System.out.println("размер size занятый массива  " + cont.getSize());

        cont.sort(new ComparatorForNumber());
        //DataContainerTest.sort(cont);
        //DataContainerTest.sort(cont, new ComparatorForNumber());
        System.out.println("отсортированный массив " + cont);
        for (Integer integer : cont) {
            System.out.print(integer + " |");
        }
        System.out.println();


        System.out.println("Время выполнения метода заполнения коллекции составляет: "  + timeResult(cont, 100_000).betweenTime() + " мс");
        System.out.println("длина массива  " + cont.getItems().length);
        System.out.println("размер size занятый массива  " + cont.getSize());
    }



    public static TimerTest timeResult(DataContainerTest<Integer> containerTest, int size){
        LocalTime start = LocalTime.now();
        for (int i = 0; i < size; i++) {
            containerTest.add(1000);
        }
        LocalTime stop = LocalTime.now();
        return new TimerTest(start, stop);
    }
}
