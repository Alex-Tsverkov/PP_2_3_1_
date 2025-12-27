package web.dao;

import web.models.User;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDao {
    @PersistenceContext
    private EntityManager em;

    public List<User> findAll() {
        return em.createQuery("from User", User.class).getResultList();
    }
    public User findById(Long id) {
        return em.find(User.class, id);
    }

    public void save(User user) {
        em.persist(user);
    }

    public void update(User user) {
        em.merge(user);
    }

    public void delete(Long id) {
        em.remove(em.find(User.class, id));
    }
}
