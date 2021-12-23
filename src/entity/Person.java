package entity;

import utils.interfaces.Precedent;

public class Person implements Precedent<Person> {

    private String name;
    private String cpf;

    public Person(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    @Override
    public int precedeA(Person person) {
        return this.name.compareTo(person.name);
    }

    @Override
    public String toString() {
        return  "{name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +  "}";
    }

}