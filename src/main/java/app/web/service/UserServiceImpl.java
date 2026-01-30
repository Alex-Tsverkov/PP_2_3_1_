package app.web.service;

import app.web.dao.UserDao;
import app.web.models.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao dao;

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public List<User> getAll() {
        return dao.findAll();
    }

    @Override
    @Transactional
    public void add(User user) {
        dao.save(user);
    }

    @Override
    public User get(Long id) {
        return dao.findById(id);
    }

    @Override
    @Transactional
    public void update(User user) {
        dao.update(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        dao.delete(id);
    }
}
