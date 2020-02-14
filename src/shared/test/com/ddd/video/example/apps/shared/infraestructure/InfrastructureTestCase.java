package com.ddd.video.example.apps.shared.infraestructure;

import com.ddd.video.example.apps.Starter;
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
 */
@ContextConfiguration(classes = Starter.class)
@SpringBootTest
public abstract class InfrastructureTestCase {
}
