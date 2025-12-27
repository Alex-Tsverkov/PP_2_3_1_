package web.service;

import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.models.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
public class UserService {

    private final UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public List<User> getAll() {
        return dao.findAll();
    }

    public void add(User user) {
        dao.save(user);
    }

    public User get(Long id) {
        return dao.findById(id);
    }

    public void update(User user) {
        dao.update(user);
    }

    public void delete(Long id) {
        dao.delete(id);
    }
}
