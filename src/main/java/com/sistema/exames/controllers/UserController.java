package com.sistema.exames.controllers;

import com.sistema.exames.entities.Rol;
import com.sistema.exames.entities.User;
import com.sistema.exames.entities.UserRol;
import com.sistema.exames.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) throws Exception {
        user.setProfile("default.png");

        user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));

        Set<UserRol> userRoles = new HashSet<>();

        Rol rol = new Rol();
        rol.setRolId(2L);
        rol.setName("NORMAL");

        UserRol userRol = new UserRol();
        userRol.setUser(user);
        userRol.setRol(rol);

        userRoles.add(userRol);
        return userService.saveUser(user, userRoles);
    }

    @GetMapping("/{username}")
    public User findUser(@PathVariable("username") String username) {
        return userService.findUser(username);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId) {
        userService.deleteUser(userId);
    }
}


