package com.sistema.exames.services;

import com.sistema.exames.entities.User;
import com.sistema.exames.entities.UserRol;

import java.util.Set;

public interface UserService {

    public User saveUser(User user, Set<UserRol> userRoles) throws Exception;
}
