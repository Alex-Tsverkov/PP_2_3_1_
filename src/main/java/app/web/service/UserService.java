package app.web.service;

import app.web.models.User;
import java.util.List;

public interface UserService {
     List<User> getAll();
     void add(User user) ;
     User get(Long id);
     void update(User user);
     void delete(Long id);
    }

