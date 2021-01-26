package Authorization.model;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;
    private String login;
    private String password;
    private String location;
    private Rule rule;

    public Person(String name, String surname, int age, String login, String password, String location) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.login = login;
        this.password = password;
        this.location = location;
    }
    public Person(String name, String surname, int age, String login, String password, String location,Rule rule ) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.login = login;
        this.password = password;
        this.location = location;
        this.rule=rule;
    }

    public Person() {
    }

    public Person(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(login, person.login) && Objects.equals(password, person.password) && Objects.equals(location, person.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, login, password, location);
    }

    @Override
    public String toString() {
        return "Person :" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", location='" + location + '\'' ;
    }

    @Override
    public int compareTo(Person o) {
        int number=this.login.compareTo(o.login);
        return number;
    }


}
