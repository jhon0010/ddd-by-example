package com.test.java.features.functional.interfaces.function;

import java.util.function.Function;

public class FunctionImpl implements Function<Double, Double> {

    public static void main(String[] args) {

        Function<Double, Double> pow = new FunctionImpl();
        Double valueP = pow.apply(10.2);
        System.out.println(valueP);

        // Write the same with lambda expression
        Function<Double, Double> powLambda = (doubleValue) -> doubleValue * doubleValue;
        Double resultLambda = powLambda.apply(22.2);
        System.out.println(resultLambda);

    }

    @Override
    public Double apply(Double aDouble) {
        return aDouble * aDouble;
    }

}
