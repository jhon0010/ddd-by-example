package com.test.java.immutables.dtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ValueTest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableValueTest.builder()}.
 */
@Generated(from = "ValueTest", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableValueTest extends ValueTest {
  private final double foo;
  private final String name;
  private final int typeId;

  private ImmutableValueTest(ImmutableValueTest.Builder builder) {
    this.foo = builder.foo;
    this.name = builder.name;
    this.typeId = builder.typeIdIsSet()
        ? builder.typeId
        : super.typeId();
  }

  private ImmutableValueTest(double foo, String name, int typeId) {
    this.foo = foo;
    this.name = name;
    this.typeId = typeId;
  }

  /**
   * @return The value of the {@code foo} attribute
   */
  @Override
  public double foo() {
    return foo;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  public String name() {
    return name;
  }

  /**
   * @return The value of the {@code typeId} attribute
   */
  @Override
  int typeId() {
    return typeId;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ValueTest#foo() foo} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for foo
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableValueTest withFoo(double value) {
    if (Double.doubleToLongBits(this.foo) == Double.doubleToLongBits(value)) return this;
    return new ImmutableValueTest(value, this.name, this.typeId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ValueTest#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableValueTest withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableValueTest(this.foo, newValue, this.typeId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ValueTest#typeId() typeId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for typeId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableValueTest withTypeId(int value) {
    if (this.typeId == value) return this;
    return new ImmutableValueTest(this.foo, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableValueTest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableValueTest
        && equalTo((ImmutableValueTest) another);
  }

  private boolean equalTo(ImmutableValueTest another) {
    return Double.doubleToLongBits(foo) == Double.doubleToLongBits(another.foo)
        && name.equals(another.name)
        && typeId == another.typeId;
  }

  /**
   * Computes a hash code from attributes: {@code foo}, {@code name}, {@code typeId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Double.hashCode(foo);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + typeId;
    return h;
  }

  /**
   * Prints the immutable value {@code ValueTest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "ValueTest{"
        + "foo=" + foo
        + ", name=" + name
        + ", typeId=" + typeId
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link ValueTest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ValueTest instance
   */
  public static ImmutableValueTest copyOf(ValueTest instance) {
    if (instance instanceof ImmutableValueTest) {
      return (ImmutableValueTest) instance;
    }
    return ImmutableValueTest.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableValueTest ImmutableValueTest}.
   * <pre>
   * ImmutableValueTest.builder()
   *    .foo(double) // required {@link ValueTest#foo() foo}
   *    .name(String) // required {@link ValueTest#name() name}
   *    .typeId(int) // optional {@link ValueTest#typeId() typeId}
   *    .build();
   * </pre>
   * @return A new ImmutableValueTest builder
   */
  public static ImmutableValueTest.Builder builder() {
    return new ImmutableValueTest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableValueTest ImmutableValueTest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ValueTest", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_FOO = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private static final long OPT_BIT_TYPE_ID = 0x1L;
    private long initBits = 0x3L;
    private long optBits;

    private double foo;
    private String name;
    private int typeId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ValueTest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ValueTest instance) {
      Objects.requireNonNull(instance, "instance");
      foo(instance.foo());
      name(instance.name());
      typeId(instance.typeId());
      return this;
    }

    /**
     * Initializes the value for the {@link ValueTest#foo() foo} attribute.
     * @param foo The value for foo 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder foo(double foo) {
      this.foo = foo;
      initBits &= ~INIT_BIT_FOO;
      return this;
    }

    /**
     * Initializes the value for the {@link ValueTest#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link ValueTest#typeId() typeId} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ValueTest#typeId() typeId}.</em>
     * @param typeId The value for typeId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder typeId(int typeId) {
      this.typeId = typeId;
      optBits |= OPT_BIT_TYPE_ID;
      return this;
    }

    /**
     * Builds a new {@link ImmutableValueTest ImmutableValueTest}.
     * @return An immutable instance of ValueTest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableValueTest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableValueTest(this);
    }

    private boolean typeIdIsSet() {
      return (optBits & OPT_BIT_TYPE_ID) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_FOO) != 0) attributes.add("foo");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build ValueTest, some of required attributes are not set " + attributes;
    }
  }
}
