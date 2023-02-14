package io.datajek.springdatajpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PlayerRepository {

    @PersistenceContext
    EntityManager entityManager;


}