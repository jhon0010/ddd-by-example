package com.ddd.apps;

import com.ddd.apps.shared.domain.Service;
import com.ddd.mooc.commands.AnotherFakeCommand;
import com.ddd.mooc.commands.FakeCommand;
import com.ddd.mooc.shared.infraestructure.persistence.hibernate.MoocHibernateConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import java.util.HashMap;

/**
 * {@link SpringBootApplication} = LOad all spring boot context and libraries.
 *                                  we also have to exclude the default spring boot hibernate configuration for avoid
 *                                  default custom behaviour and have custom configuration like
 *                                  {@link MoocHibernateConfiguration}.
 * {@link ComponentScan} = Allow the dependency injection , in the package and recognize the components of spring.
 *
 * With the ComponentScan you can make injection of this classes latter.
 */
@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@ComponentScan(
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class),
        value = {"com.ddd.apps.mooc","com.ddd.mooc","com.ddd.shared"}
)
public class MoocBackendApplication {

    public static HashMap<String, Class<?>> commands() {
        return new HashMap<>() {{
            put("fake", FakeCommand.class);
            put("another_fake", AnotherFakeCommand.class);
        }};
    }

}
