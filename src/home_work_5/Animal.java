package home_work_5;

import home_work_5.utils.ComparatorUtils;

public class Animal implements Comparable<Animal>{
    private final String nick;
    private final int age;

    public Animal(String nick, int age) {
        this.nick = nick;
        if (isValidAge(age)){
            this.age = age;
        } else {
            throw new IllegalArgumentException("Возраст животного должен быть от 1 до 15 лет");
        }
    }

    public String getNick() {
        return nick;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nick=\"" + nick + '\"' +
                ", age=" + age +
                '}';
    }

    private boolean isValidAge(int age) {
        return age >= 1 && age <= 15;
    }

    @Override
    public int compareTo(Animal a) {
       return ComparatorUtils.compare(this, a);
    }
}
