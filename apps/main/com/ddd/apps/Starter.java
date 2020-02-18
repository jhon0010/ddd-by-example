package com.ddd.apps;

import com.ddd.apps.shared.domain.Service;
import com.ddd.mooc.shared.infraestructure.persistence.hibernate.MoocHibernateConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import java.util.Arrays;

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
        value = {"com.ddd.apps","com.ddd.mooc","com.ddd.backoffice"}
)
public class Starter {

    public static void main(String[] args) {

        SpringApplication.run(Starter.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext applicationContext) {
        return args -> {
              System.out.println("Inspect the beans ");
              String[] beanNames = applicationContext.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName :   beanNames) {
                System.out.println("Inspect the bean = " + beanName);
            }
        };
    }

}
