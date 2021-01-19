package Authorization.storage;

import Authorization.model.Person;

import java.util.ArrayList;
import java.util.List;

public class InMemory {
    private static List<Person> personList = new ArrayList<>();

    public  List<Person> AllPerson() {
        return new ArrayList<>(personList);
    }



    public boolean chekingLogin(Person person) {
        boolean chek = true;
        for (Person per : personList) {
            if (per.getLogin().compareTo(person.getLogin())==0) {
                chek = false;
                break;
            }
        }
        return chek;
    }

    public Person byLogin(String login){
        for(Person p:personList){
            if(p.getLogin().equals(login)){
                return p;
            }
        }
        return null;
    }


    public void addPerson(Person person){
        personList.add(person);
    }


}
