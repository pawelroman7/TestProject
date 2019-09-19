package pl.baroman.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.baroman.entity.TestEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class TestDao {
    @Autowired
    TestDao testDao;

    @PersistenceContext
    private EntityManager entityManager;

    public void saveTestEntity(){
        TestEntity testEntity = new TestEntity(1);
        entityManager.persist(testEntity);
    }

}
