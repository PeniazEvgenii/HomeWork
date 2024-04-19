package home_work_5;

public class Person {
    private final String nick;
    private final String password;
    private final String name;

    public Person(String nick, String password, String name) throws IllegalArgumentException {
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

    private boolean isValidPass(String str) {
        return str.length() >= 5 && str.length() <= 10;
    }
}
