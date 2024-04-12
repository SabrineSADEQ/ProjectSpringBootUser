package com.example.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.DaoUser;
import com.example.entity.EntityUser;
import java.util.List;


@Service
public class ServiceUser {
    private DaoUser userDao;
    @Autowired
    public ServiceUser(DaoUser userDao) {
        this.userDao = userDao;
    }

    public EntityUser registerUser(EntityUser user) {  
        return userDao.save(user);
    }
    
    public List<EntityUser> getAllUsers() {
        return userDao.findAll();
    }
}
