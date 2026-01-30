package app.web.service;

import app.web.models.User;
import java.util.List;

public interface UserService {
    public List<User> getAll();
    public void add(User user) ;
    public User get(Long id);
    public void update(User user);
    public void delete(Long id);
    }

