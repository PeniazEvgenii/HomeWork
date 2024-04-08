package test.home_work_4;

import home_work_4.ComparatorForNumber;
import home_work_4.ComparatorForStringLength;
import home_work_4.DataContainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;

public class DataContainerTest {

    @Test
    public void addFirstTest() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{});
        int index = container.add(100);
        Assertions.assertEquals(100, container.get(index));
    }

    @Test
    public void addEndTest() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1,2,3,4,5});
        int index = container.add(100);
        Assertions.assertEquals(100, container.get(index));
    }

    @Test
    public void addInsteadNullTest() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, null, 3, null, null, null});
        int index = container.add(100);
        Assertions.assertEquals(100, container.get(index));
    }

    @Test
    public void addNullTest() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, null, 3, null, null, null});
        int index = container.add(null);
        Assertions.assertEquals(-1, index);
    }

    @Test
    public void getTest() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1,2,3,4,5});
        assertAll("test get()",
                () -> Assertions.assertEquals(1, container.get(0)),
                () -> Assertions.assertEquals(5, container.get(4)),
                () -> Assertions.assertNull(container.get(6))
        );
    }

    @Test
    public void getItemsTest() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1,2,3,4,5});
        Assertions.assertArrayEquals(new Integer[]{1,2,3,4,5}, container.getItems());
    }

    @Test
    public void getItemsEmptyArrayTest() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{});
        Assertions.assertArrayEquals(new Integer[]{}, container.getItems());
    }

    @Test
    public void deleteByIndexTest() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{});
        int index = container.add(10);
        container.delete(index);
        Assertions.assertNull(container.get(index));
        Assertions.assertFalse(container.delete(index));
    }

    @Test
    public void deleteByItemTest() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{});
        int index = container.add(10);
        container.delete(Integer.valueOf(10));
        Assertions.assertNull(container.get(index));
        Assertions.assertFalse(container.delete(index));
    }

    @Test
    public void deleteByItemNullTest() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1,2,null,4,5});
        container.delete(null);
        Assertions.assertArrayEquals(new Integer[]{1,2,null,4,5}, container.getItems());
    }

    @Test
    public void deleteByItemSameValueTest() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1,2,3,777,3});
        container.delete(Integer.valueOf(3));
        Assertions.assertArrayEquals(new Integer[]{1,2,777,3}, container.getItems());
    }

    @Test
    public void sortTest() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{3, 1, 3, 777, 19, 10});
        container.sort(new ComparatorForNumber());
        Assertions.assertArrayEquals(new Integer[]{1, 3, 3, 10, 19, 777}, container.getItems());
    }

    @Test
    public void sortStringTest() {
        DataContainer<String> container = new DataContainer<>(new String[]{"i", "hello", "1", "Как домашка", "Что делаешь?", "ii"});
        container.sort(new ComparatorForStringLength());
        Assertions.assertArrayEquals(new String[]{"i", "1", "ii", "hello", "Как домашка", "Что делаешь?"}, container.getItems());
    }

    @Test
    public void sortComparableStaticTest() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{3, 1, 3, 777, 19, 10});
        DataContainer.sort(container);
        Assertions.assertArrayEquals(new Integer[]{1, 3, 3, 10, 19, 777}, container.getItems());
    }

    @Test
    public void sortStaticTest() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{3, 1, 3, 777, 19, 10});
        DataContainer.sort(container, new ComparatorForNumber());
        Assertions.assertArrayEquals(new Integer[]{1, 3, 3, 10, 19, 777}, container.getItems());
    }

}
