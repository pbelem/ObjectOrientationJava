package application;

import entities.Person;

public class Program {

    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("entities.Person");
        System.out.println(Person.class);


    }
}
