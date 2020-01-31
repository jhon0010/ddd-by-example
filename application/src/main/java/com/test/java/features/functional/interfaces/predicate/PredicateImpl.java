package com.test.java.features.functional.interfaces.predicate;

import java.util.function.Predicate;

/**
 * Function that take one value and return Boolean response
 */
public class PredicateImpl {

    public static void main(String[] args) {
        Predicate<Long> greaterThanFive = (x) -> x > 5;
        Boolean response = greaterThanFive.test(10L);
        System.out.println(response);
    }

}
