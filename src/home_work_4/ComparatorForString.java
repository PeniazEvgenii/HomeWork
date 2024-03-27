package home_work_4;

import java.util.Comparator;

public class ComparatorForString implements Comparator<String> {

    /**
     * Method to compare length of two object, that has type String
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return the value 0 if two object is equal; a value -1 if first string argument less than the second string argument;
     * and a value 1 if first string argument is greater than the second string argument.
     */
    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length()) {
            return 1;
        } else if(o1.length() == o2.length()) {
            return 0;
        } else {
            return -1;
        }
       // return (o1.length() - o2.length());
    }
}
