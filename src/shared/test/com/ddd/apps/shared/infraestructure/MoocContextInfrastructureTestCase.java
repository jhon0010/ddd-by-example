package com.ddd.apps.shared.infraestructure;

import com.ddd.apps.MoocBackendApplication;
import com.ddd.apps.shared.InfrastructureTestCase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * Generic class that allow extend for it and allow to know that is a spring boot tests
 * "@SpringBootTest" and this allow us to inject dependencies here.
 *
 * Use the same configuration that you have in @ContextConfiguration(classes = Starter.class)
 *
 * All integration test must to have to extend for it.
 *
 * Use MoocBackendApplication as a context bc this contains the refenreces to the services classes in the spring boot context
 * so you can inject it and  use it in your tests,
 *
 */
@ContextConfiguration(classes = MoocBackendApplication.class)
@SpringBootTest
public abstract class MoocContextInfrastructureTestCase extends InfrastructureTestCase {
}
