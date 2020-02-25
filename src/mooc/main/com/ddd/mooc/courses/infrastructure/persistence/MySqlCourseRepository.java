package com.ddd.mooc.courses.infrastructure.persistence;

import com.ddd.apps.shared.domain.Service;
import com.ddd.mooc.courses.domain.Course;
import com.ddd.mooc.courses.domain.CourseId;
import com.ddd.mooc.courses.domain.CourseRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Primary
@Transactional("mooc-transaction_manager")
public class MySqlCourseRepository implements CourseRepository {

    private SessionFactory sessionFactory;


    public MySqlCourseRepository(@Qualifier("mooc-session_factory") SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     * All query in hibernate must be transactional , TODO move to the service layer use case.
     * @param course
     */
    @Override
    public void save(Course course) {
        sessionFactory.getCurrentSession().save(course);
    }

    @Override
    public Optional<Course> get(CourseId id) {
        return Optional.ofNullable(sessionFactory.getCurrentSession().find(Course.class, id));
    }

}
