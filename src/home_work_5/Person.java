package home_work_5;


import home_work_5.utils.ComparatorUtils;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private final String nick;
    private final String password;
    private final String name;

    public Person(String nick, String password, String name)  throws IllegalArgumentException {
        this.nick = nick;
        this.name = name;
        if(isValidPass(password)) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Длина пароля должна быть от 5 до 10 символов");
        }
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick=\"" + nick + '\"' +
                ", password=" + password +
                ", name=\"" + name + '\"' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(nick, person.nick) && Objects.equals(password, person.password) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, password, name);
    }

    private boolean isValidPass(String str) {
        return str.length() >= 5 && str.length() <= 10;
    }


   @Override
   public int compareTo(Person p) {
       return ComparatorUtils.compareByLengthPass(this, p);
      // return password.length() - p.password.length();
   }
}
