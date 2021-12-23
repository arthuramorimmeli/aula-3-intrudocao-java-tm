import entity.Person;
import utils.SortUtils;
import utils.interfaces.Precedent;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("marina", "321321");
        Person person1 = new Person("athur", "123.321.321.321");
        Person person2 = new Person("joao", "321321");


        ArrayList<Precedent<Person>> people = new ArrayList<>();
        people.add(person);
        people.add(person1);
        people.add(person2);

        System.out.println(people);
        SortUtils.<Person>sort(people);
        System.out.println(people);
    }
}
