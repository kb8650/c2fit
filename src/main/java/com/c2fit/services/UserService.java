package com.c2fit.services;

import com.c2fit.models.User;
import com.c2fit.models.UserRole;

import java.util.Set;

public interface UserService {

    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get user by username
    public User getUser(String username);

    //delete user by userID
    public boolean deleteUser(Long userId);

    //update user
    public User updateUser(User user, Long userId);
}
