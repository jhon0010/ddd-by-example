package com.test.java.features.main;

import com.test.java.features.functional.interfaces.function.FunctionImpl;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Supplier<Double> randomValue = () -> Math.random();
        Double value = randomValue.get();
        System.out.println(value);

        Function<Double, Double> pow = new FunctionImpl();
        Double valueP = pow.apply(10.2);
        System.out.println(valueP);

        // Write the same with lambda expression
        Function<Double, Double> powLambda = (doubleValue) -> doubleValue * doubleValue;
        Double resultLambda = powLambda.apply(22.2);
        System.out.println(resultLambda);

    }

}
