package home_work_4;

import java.util.Comparator;

public class ComparatorForNumber implements Comparator <Number> {

    /**
     * Method to compare value two object, that has type Number
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return the value 0 if two object is equal; a value -1 if first number argument less than the second number argument;
     * and a value 1 if first number argument is greater than the second number argument.
     */
    @Override
    public int compare(Number o1, Number o2) {
        if(o1.doubleValue() == o2.doubleValue()) {
            return 0;
        } else if (o1.doubleValue() > o2.doubleValue()) {
            return 1;
        } else {
            return -1;
        }
    }
}
