package com.wanglu.movcat.service.impl;

import com.wanglu.movcat.model.User;
import com.wanglu.movcat.repository.UserRepository;
import com.wanglu.movcat.service.UserService;
import com.wanglu.movcat.util.AccountValidatorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public boolean findByTelOrEmail(String telOrEmail) {
        User user = userRepository.findByTelOrEmail(telOrEmail, telOrEmail);
        if (user == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public User findByPasswordAndTelOrEmail(String telOrEmail, String password) {
        return userRepository.findByPasswordAndTelOrEmail(password, telOrEmail, telOrEmail);
    }

    @Override
    public User saveUser(User user) {
        User u = null;
        if (AccountValidatorUtil.isMobile(user.getTel())){
            user.setEmail(null);
            u = userRepository.save(user);
        }if (AccountValidatorUtil.isEmail(user.getEmail())){
            user.setTel(null);
            u = userRepository.save(user);
        }
        return u;
    }

    @Override
    public User findOne(Integer id) {
        return userRepository.findOne(id);
    }
}
