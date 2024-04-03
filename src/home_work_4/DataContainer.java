package home_work_4;

import java.util.*;

/**
 * Задание:
 * 1. Создать класс DataContainer у которого есть один дженерик (обобщение). Например литерал T. Данный класс как раз и будет решать задачу поставленную перед нами:
 *  хранить неограниченное количество передаваемых объектов обобщённого типа.
 * 2. Внутри DataContainer должно быть поле T[] data, внутренний массив, которое предназначено для хранения передаваемых объектов. Да, именно T[] а не Object[].
 *  Если использовать Object[] то это будет опасно и постоянно придётся делать приведеление типов. Поле обязательно не static и private
 * 3. Из-за особенностей дженериков в данном классе обязательно будет присутствовать один конструктор DataContainer(T[]). Есть и другие способы,
 * но в рамках обучения они будут сложными и с ними мы разбираться будем слишком сложно.
 * 4. В данном классе должен быть метод int add(T item) который добавляет данные во внутреннее поле data и возвращает номер позиции в которую были вставлены данные, начиная с 0.
 * 	4.1 Если поле data не переполнено то данные нужно добавлять в первую позицию (ячейку) после последней заполненной позиции (ячейки).
 * 		4.1.1 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777, null, null]. Метод add вернёт число 3.
 * 		4.1.2 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(null). Должно получиться data = [1, 2, 3, null, null, null]. Метод add вернёт число -1. -1 будет индикатором того что данный элемент в наш
 * 		контейнер вставлять нельзя.
 * 		4.1.3 Пример: data = [1, null, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 777, 3, null, null, null]. Метод add вернёт число 1.
 * 	4.2 В случае если поле data переполнено, нужно придумать механизм который будет расширять пространство для новых элементов. Тут вам поможет Arrays.copyOf.
 * 		4.2.1 Пример: data = [1, 2, 3]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777]. Метод add вернёт число 3.
 * 		4.2.2 Пример: data = []. Вызвали add(777). Должно получиться data = [777]. Метод add вернёт число 0.
 * 5. В данном классе должен быть метод T get(int index). Данный метод получает из DataContainer'а, из поля data, предварительно сохранённый объект который мы передали на предыдущем шаге через метод add.
 * 	5.1 Пример: data = []. Вызвали add(9999). Получили data = [9999]. Метод add вернул число 0. Вызываем get(0). Метод get возвращает 9999
 * 	5.2 Пример: data = [9999]. Вызываем get(1). Метод get возвращает null
 * 6. В данном классе должен быть метод T[] getItems(). Данный метод возвращает массив из поля data.
 * 7. Добавить метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу.
 * 	7.1 Метод возвращает true если у нас получилось удалить данные.
 * 		7.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(3). Должно получиться data = [1, 2, 3]. Метод delete вернёт true
 * 	7.2 Метод возвращает false если нет такого индекса.
 * 		7.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(9). Должно получиться data = [1, 2, 3, 777]. Метод delete вернёт false
 * 	7.3. Освободившуюся ячейку в поеле data необходимо удалить полностью. Пустых элементов не должно быть.
 * 		7.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(2). Должно получиться data = [1, 2, 777]. Метод delete вернёт true
 * 8. Добавить метод boolean delete(T item) который будет удалять элемент из нашего поля data.
 * 	8.1 Метод возвращает false если передают null.
 * 		8.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(null). Метод delete вернёт false a data = [1, 2, 3, 777]
 * 		8.1.2 Пример data = [1, 2, 3, 777, null]. Вызывают delete(null). Метод delete вернёт false a data = [1, 2, 3, 777, null]
 * 	8.2 Метод возвращает true если у нас получилось удалить данные.
 * 		8.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(777). Должно получиться data = [1, 2, 3]. Метод delete вернёт true
 * 	8.3 Метод возвращает false если нет такого элемента.
 * 		8.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(111). Должно получиться data = [1, 2, 3, 777]. Метод delete вернёт false
 * 	8.4 Освободившуюся ячейку необходимо удалить полностью. Пустых элементов не должно быть.
 * 		8.4.1 Пример data = [1, 2, 3, 777, 3]. Вызывают delete(3). Должно получиться data = [1, 2, 777, 3]. Метод delete вернёт true
 * 9. Добавить НЕ СТАТИЧЕСКИЙ метод void sort(Comparator<.......> comparator). Данный метод занимается сортировкой данных записанных в поле data используя реализацию сравнения из ПЕРЕДАННОГО объекта comparator.
 * Классом Arrays пользоваться запрещено. Интефейс Comparator обязательно должен быть реализован отдельным классом. Для каждого типа данных и сравнений программист создаёт отдельную реализацию интерфейса Comparator.
 * 	9.1 Пример data = [3, 1, 3, 777]. Вызывают sort(....) передавая компаратор чисел. Должно получиться data = [1, 3, 3, 777]
 * 	9.2 Пример data = ["i", "hello", "1", "Как домашка"]. Вызывают sort(....) передавая компаратор строк по длинне. Должно получиться data = ["i", "1", "hello", "Как домашка"]
 * 10. Переопределить метод toString() в классе и выводить содержимое data без ячеек в которых хранится null. Запрещено использовать Arrays.toString()
 * 	10.1 Пример data = [1, 2, 3, 777, 3]. Вызывают toString() у созданного DataContainer. Возвращается строка [1, 2, 3, 777, 3]
 * 	10.2 Пример data = [1, 2, 3, null]. Вызывают toString() у созданного DataContainer. Возвращается строка [1, 2, 3]
 * 	10.3 Пример data = []. Вызывают toString() у созданного DataContainer. Возвращается строка []
 * 11.* В DataContainer добавить СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container) с дженериком extends Comparable. Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте DataContainer
 * используя реализацию сравнения вызываемый у хранимых объектов. Для этого надо сделать дженерик метод.
 * 12.* В DataContainer добавить СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container, Comparator<.......> comparator) который будет принимать объект DataContainer и реализацию интерфейса Comparator.
 * Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте DataContainer используя реализацию сравнения из ПЕРЕДАННОГО объекта интерфейса Comparator.
 * 13.** Реализовать в DataContainer интерфейс Iterable
 */
public class DataContainer<T> implements Iterable<T>{
    private T[] data;

    /**
     * Конструктор принимающий массив
     * @param array массив
     */
    public DataContainer(T[] array) {
        this.data = array;
    }

    /**
     * Метод для добавления данных во внутреннее поле data[]
     * @param item элемент для помещения в data
     * @return возвращает номер позиции, в которую вставлены данные. Возвращет -1, если элемент добавить нельзя
     */
    public int add(T item) {
        if (item == null) {
            return -1;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = item;
        return data.length - 1;
    }

    /**
     * метод получает из поля data[] сохраненный объект по индексу
     * @param index индекс массива
     * @return объект по номеру индекса, Null при отсутствии объекта по index
     */
    public T get(int index) {
        if(isIncludeIndex(index)) {
            return data[index];
        } else {
            return null;
        }
    }

    /**
     * Метод возвращения массива из поля data[]
     * @return массив
     */
    public T[] getItems(){
        return data;
    }

    /**
     * Метод для удаление элементов из поля data[] по индексу
     * @param index индекс удаляемого элемента
     * @return true при успешном удалении элемента, false если элемент с заданным индексом отсутствует
     */
    public boolean delete(int index) {
        if(!isIncludeIndex(index)) {
            return false;
        }
        for (int i = index; i < data.length - 1; i++) {
            swapElement(data, i, i + 1);
        }
        data = Arrays.copyOf(data, data.length - 1);
        return true;
    }

    /**
     * Метод для удаления элемента из поля data[] по значению
     * @param item значение удаляемого объекта
     * @return false если передают null или нет такого элемента,возвращает true если произошло удаление данных
     */
    public boolean delete(T item) {
        if (item == null) {
            return false;
        }
        for (int i = 0; i < data.length; i++) {
            if (Objects.equals(data[i], item)) {
                for (int j = i;  j < data.length - 1; j++) {
                    swapElement(data, j,j + 1);
                }
                data = Arrays.copyOf(data, data.length - 1);
                return true;
            }
        }
        return false;
    }

    /**
     * метод для сортировки данных в поле data используя реализацию сравнения из переданного объекта comparator
     * в методе использована сортировка типа "Шейкерная сортировка"
     * @param comparator объект Типа comparator c реализованным сравнением
     */
    public void sort (Comparator <? super T> comparator) {
       int left = 0;
       int right = data.length - 1;
       int flag = 1;
        while(left < right && flag != 0) {
            flag = 0;

            for (int i = left; i < right; i++) {
                if(comparator.compare(data[i], data[i + 1]) > 0){
                    swapElement(data, i, i + 1);
                    flag = 1;
                }
            }
            right--;

            for (int i = right; i > left; i--) {
                if(comparator.compare(data[i], data[i - 1]) < 0){
                    swapElement(data, i, i - 1);
                    flag = 1;
                }
            }
            left++;
        }
    }

    /**
     * Метод для записи значений поля data в строку
     * @return строка со значениями из дата
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (T dat : data) {
            if (dat != null) {
                if (stringBuilder.length() > 1) {
                    stringBuilder.append(",").append(" ").append(dat);
                } else {
                    stringBuilder.append(dat);
                }
            }
        }
            stringBuilder.append("]");
        return stringBuilder.toString();
    }


    /**
     * Метод для сортировки списка DataContainer, содержащего объекты реализующие интерфейс Comparable
     * @param container список, элементы которого необходимо отсортировать
     */
    public static<T extends Comparable<? super T>> void sort (DataContainer<T> container) {
        if(container.getItems().length <= 1) {
            return;
        }
        for (int i = 0; i < container.getItems().length; i++) {
            for (int j = 0; j < container.getItems().length - 1; j++) {
                if(container.getItems()[j].compareTo(container.getItems()[j + 1]) > 0) {
                    T temp = container.getItems()[j];
                    container.getItems()[j] = container.getItems()[j + 1];
                    container.getItems()[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Метод для сортировки списка DataContainer, используя реализацию сравнения из переданного объекта comparator
     * реализация сравнения осуществлена в методе sort {@link #sort(Comparator)}
     * @param container список типа DataContainer, элементы которого необходимо отсортировать
     * @param comparator объект типа comparator c реализованным сравнением
     */
    public static<T> void sort(DataContainer<T> container, Comparator<? super T> comparator) {
        container.sort(comparator);
    }

    /**
     * Метод проверки соответствия индекса для поля data
     * @param index проверяемый индекс
     * @return true если в массиве есть элемент с индексом index, false если в массиве нет элемент с индексом index
     */
    private boolean isIncludeIndex (int index) {
        return index < data.length && index >= 0;
    }

    /**
     * Метод замены двух элементов массива местами
     * @param array массив, в котором меняем элементы
     * @param index1 первый элемент
     * @param index2 второй элемент
     */
    private void swapElement(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     *  У интерфейса Iterable<> необходимо переопределить один метод iteretor(). Метод iterator() интерфейса Iterable возвращает объект типа Iterator.
     *  Можно, чтобы класс реализующий интерфейс Iterable, также реализовывал интерфейс Iterator. Можно использовать вложенный класс, реализующий интерфейс Iterator.
     *  В данном случае реализация через анонимный класс (предложила IDE переопределении).
     */

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = -1;

            /**
             * Метод определения наличия следующего элемента в поле data[]
             * @return true если имеется следующий элемент, false если отсутствует
             */
            @Override
            public boolean hasNext() {
                return index + 1 < data.length;
            }

            /**
             * Метод получения элемента элемента из поля data[]
             * @return элемент поля data, при выходе за пределы массива возвращает исключение NoSuchElementException()
             */
            @Override
            public T next() {
                index++;
                if(index >= 0 && index < data.length) {
                    return data[index];
                } else {
                    throw new NoSuchElementException();
                }
            }
        };
    }
}





