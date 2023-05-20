package com.github.jaryarbn.minishop.service;

import com.github.jaryarbn.minishop.dao.UserDao;
import com.github.jaryarbn.minishop.generate.User;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    @SuppressFBWarnings("EI_EXPOSE_REP2")
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User createUserIfNotExist(String tel) {
        User user = new User();
        user.setTel(tel);
        user.setCreatedAt(new Date());
        user.setUpdatedAt(new Date());
        try {
            userDao.insertUser(user);
        }catch (PersistenceException e){
            return userDao.getUserByTel(tel);
        }
        return user;
    }
}
