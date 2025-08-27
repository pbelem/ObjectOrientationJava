package application;

import entities.Person;
import entities.Student;

import java.lang.reflect.Field;
import java.util.Arrays;

public class InspectStudent {

    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println(InspectStudent.class.getSimpleName());
        System.out.println(Arrays.toString(Person.class.getConstructors()));
        System.out.println(Person.class.getConstructors().length);
        System.out.println(Arrays.toString(Person.class.getDeclaredMethods()));
        System.out.println(Arrays.toString(Person.class.getDeclaredFields()));

        Class.forName("application.Student");

//        Class<?> clazz = Class.forName("entities.Student");





    }
}
