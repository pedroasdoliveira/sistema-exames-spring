package com.sistema.exames.services.implementation;

import com.sistema.exames.entities.User;
import com.sistema.exames.entities.UserRol;
import com.sistema.exames.repositories.RolRepository;
import com.sistema.exames.repositories.UserRepository;
import com.sistema.exames.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RolRepository rolRepository;

    @Override
    public User saveUser(User user, Set<UserRol> userRoles) throws Exception {
        User userLocal = userRepository.findByUsername(user.getUsername());

        if (userLocal != null) {
            System.out.println("O usuário já existe!");
            throw new Exception("O usuário já existe no servidor!");
        } else {
            for (UserRol userRol:userRoles) {
                rolRepository.save(userRol.getRol());
            }

            user.getUserRol().addAll(userRoles);
            userLocal = userRepository.save(user);
        }

        return userLocal;
    }
}
