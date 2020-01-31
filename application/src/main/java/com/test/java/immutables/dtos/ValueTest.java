package com.test.java.immutables.dtos;

import org.immutables.value.Value;

/**
 * This class can contains attributes also.
 */
//@Value.Style(typeImmutable = "Immu") // you can change the default name value of the generated Immutable class
//@Value.Style(visibility = Value.Style.ImplementationVisibility.PUBLIC,  overshadowImplementation = true)


/**
 * Avoid to duplicate assignments to the same variable, throw IllegalStateException.
 * Do not generate the from method that allow copy the current object from a new one.
 * In the attributes of collection type only add methods are generated.
 *
 *         ImmutableValueTest objValueTest = ImmutableValueTest.builder()
 *                 .foo(2.00)
 *                 .name("John")
 *                 .name("c")
 *                 .build();
 */
//@Value.Style(strictBuilder = true )

//@Value.Style(
//        visibility = Value.Style.ImplementationVisibility.PUBLIC,
//        builderVisibility = Value.Style.BuilderVisibility.PUBLIC,
//        typeImmutable = "*",
//        depluralize = true,
//        redactedMask = "****")
@Value.Immutable
public abstract class ValueTest {

    // This attributes can not be final
    public abstract double foo();
    public abstract String name();

    @Value.Default
    int typeId () { return 1; }

    public String upperCaseName(String name) {
        return name.toUpperCase();
    }

}
