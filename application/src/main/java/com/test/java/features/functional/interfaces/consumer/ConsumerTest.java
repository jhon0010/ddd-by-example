package com.test.java.features.functional.interfaces.consumer;

import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        Consumer<String> consumer = ConsumerTest::consumeString;
        consumer.accept("Feature");
        consumer.accept("IDE test");
        consumer.accept(null);
    }

    private static void consumeString(String some) {
        System.out.println(some);
    }

}
