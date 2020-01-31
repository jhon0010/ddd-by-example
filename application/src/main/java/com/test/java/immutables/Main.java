package com.test.java.immutables;

//import com.test.java.immutables.dtos.ImmutableValueTest;

//import com.test.java.immutables.dtos.ImmutableValueTest;
import com.test.java.immutables.dtos.ValueTest;

public class Main {

    private static final long INIT_BIT_FOO = 0x2L;
    private static long initBits = 0x3L;


    public static void main(String[] args) {



        // Must be compiled before to be used = gradle build
//        ImmutableValueTest objValueTest = ImmutableValueTest.builder()
//                .foo(2.00)
//                .name("John")
//                .build();
//
//
//        ImmutableValueTest immu2 = objValueTest.withName("j");
//
//        objValueTest.upperCaseName(objValueTest.name());
//
//        ImmutableValueTest imVal = objValueTest.withName("Juan");
//
//        System.out.println(objValueTest.name());
//        System.out.println(imVal.name());
//        System.out.println(imVal.toString());
        long x = initBits &= ~INIT_BIT_FOO;
        boolean a = true;
        boolean b = false;

        boolean c = a &= b;

        System.out.println("__________________    = " + c);

    }

}
