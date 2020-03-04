package com.ddd.mooc.steps.infrastructure.persistence;

import com.ddd.apps.shared.domain.Service;
import com.ddd.apps.shared.infraestructure.hibernate.HibernateRepository;
import com.ddd.mooc.steps.domain.Step;
import com.ddd.mooc.steps.domain.StepId;
import com.ddd.mooc.steps.domain.StepRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional("mooc-transaction_manager")
public class MySqlStepRepository extends HibernateRepository<Step> implements StepRepository {
    public MySqlStepRepository(@Qualifier("mooc-session_factory") SessionFactory sessionFactory) {
        super(sessionFactory, Step.class);
    }

    @Override
    public void save(Step step) {
        persist(step);
    }

    @Override
    public Optional<? extends Step> search(StepId id) {
        return byId(id);
    }
}
