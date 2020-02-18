package com.ddd.video.example.apps.mooc.courses.infraestructure.persistence;

import com.ddd.video.example.apps.mooc.courses.domain.Course;
import com.ddd.video.example.apps.mooc.courses.domain.CourseId;
import com.ddd.video.example.apps.mooc.courses.domain.CourseRepository;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional("mooc-transaction_manager")
public class MySqlCourseRepository implements CourseRepository {

    private SessionFactory sessionFactory;

    public MySqlCourseRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     * All query in hibernate must be transactional , TODO move to the service layer use case.
     * @param course
     */
    @Transactional
    @Override
    public void save(Course course) {
        sessionFactory.getCurrentSession().save(course);
    }

    @Override
    public Optional<Course> get(String id) {
        return Optional.ofNullable(sessionFactory.getCurrentSession().find(Course.class, id));
    }

    @Override
    public void delete(String id) {

    }


    public List<Course> matching(Criteria criteria) {
        return null;
    }
}
