package com.c2fit.services.impl;

import com.c2fit.models.User;
import com.c2fit.models.UserRole;
import com.c2fit.repository.RoleRepository;
import com.c2fit.repository.UserRepository;
import com.c2fit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    //creating user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {

        User local = this.userRepository.findByUsername(user.getUsername());
        if(local!=null) {
            System.out.println("User is already there !!");
                throw new Exception("User already present !!");
        } else {
            //user create
            for(UserRole ur:userRoles)
            {
                roleRepository.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles);
            local = this.userRepository.save(user);
        }
        return local;
    }

    //getting user by username
    @Override
    public User getUser(String username) {

        return this.userRepository.findByUsername(username);
    }

    @Override
    public boolean deleteUser(Long userId) {
        try {
            userRepository.deleteById(userId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public User updateUser(User user, Long userId) {
        return this.userRepository.save(user);
    }
}
