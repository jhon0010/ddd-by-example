package com.test.java.features.functional.interfaces.unary;

import com.test.java.features.model.Person;

import java.util.function.UnaryOperator;

/**
 * Take one argument of type x and return the same type of object.
 * <p>
 * Useful for update information of one object and return the same.
 */
public class UnaryImpl {

    public static void main(String[] args) {

        UnaryOperator<Person> personUnary = p -> {
            p.setFirstName("Changed name");
            return p;
        } ;

        Person p = new Person();
        p.setId("1");
        p.setFirstName("Joe");
        p.setLastName("Doe");

        Person changedPerson = personUnary.apply(p);
        System.out.println(changedPerson);

    }
}
