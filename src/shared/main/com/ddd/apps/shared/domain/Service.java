package com.ddd.apps.shared.domain;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Annotation create for alow more clean code, hiding the real implementation of spring service.
 *
 * This is good because if the package of spring  change or if we want to a new implementation
 * we only need to do this change here.
 *
 * For use it only add to the component scan
 *  @ComponentScan(
 *         includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class),
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Service {
}
