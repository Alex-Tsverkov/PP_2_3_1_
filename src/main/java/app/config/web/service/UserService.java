package app.config.web.service;

import org.springframework.transaction.annotation.Transactional;
import app.config.web.dao.UserDao;
import app.config.web.models.User;
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
    @Transactional
    public void add(User user) {
        dao.save(user);
    }
    public User get(Long id) {
        return dao.findById(id);
    }
    @Transactional
    public void update(User user) {
        dao.update(user);
    }
    @Transactional
    public void delete(Long id) {
        dao.delete(id);
    }
}
