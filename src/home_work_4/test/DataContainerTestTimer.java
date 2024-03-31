package home_work_4.test;

import home_work_4.test.dto.TimerTest;

import java.time.LocalTime;

/**
 * Проверка работы DataContainerTest c изменяемой длинной массива на заданное количество при добавлении данных
 * Тестировалось 300_000 записей числа "1000" на одном и том же пк. Менялось значение в константе SIZE_INCRESE_ARRAY класса {@link DataContainerTest<>}
 * При увеличении массива на 1, время выполнения метода составило 65,22 сек
 * При увеличении массива на 10, время выполнения метода составило 24,61 сек
 * При увеличении массива на 20, время выполнения метода составило 22,42 сек
 * При увеличении массива на 50, время выполнения метода составило 19,08 сек
 * При увеличении массива на 100, время выполнения метода составило 14,1 сек
 */
public class DataContainerTestTimer {
    public static void main(String[] args) {
        Integer[] a = {null, null, 5,6,null,10,null, null, null};

        DataContainerTest<Integer> cont = new DataContainerTest<>(a);
        System.out.println(cont);

        System.out.println("Время выполнения метода заполнения контейнера составляет: "  + timeResult(cont, 300_000).betweenTime() + " мс");
        System.out.println("длина массива  " + cont.getItems().length);
    }

    /**
     * Метод осуществляющий добавление элементов в объект DataContainerTest<Integer>
     * @param containerTest объект DataContainerTest<Integer>, в который добавляем элементы
     * @param size количество добавляемых элементов
     * @return время добавления элементов
     */
    public static TimerTest timeResult(DataContainerTest<Integer> containerTest, int size){
        LocalTime start = LocalTime.now();
        for (int i = 0; i < size; i++) {
            containerTest.add(1000);
        }
        LocalTime stop = LocalTime.now();
        return new TimerTest(start, stop);
    }
}
