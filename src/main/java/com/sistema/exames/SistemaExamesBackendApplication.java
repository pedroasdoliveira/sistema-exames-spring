package com.sistema.exames;

import com.sistema.exames.entities.Rol;
import com.sistema.exames.entities.User;
import com.sistema.exames.entities.UserRol;
import com.sistema.exames.exceptions.UserFoundException;
import com.sistema.exames.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaExamesBackendApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SistemaExamesBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*try {
			User user = new User();
			user.setName("Pedro");
			user.setNickname("Henrique");
			user.setUsername("pedhenri");
			user.setPassword(bCryptPasswordEncoder.encode("44528033"));
			user.setEmail("pedro@gmail.com");
			user.setPhone("119924534879");
			user.setProfile("foto.png");

			Rol rol = new Rol();
			rol.setRolId(1L);
			rol.setName("ADMIN");

			Set<UserRol> userRoles = new HashSet<>();
			UserRol userRol = new UserRol();
			userRol.setRol(rol);
			userRol.setUser(user);
			userRoles.add(userRol);

			User userSave = userService.saveUser(user, userRoles);
			System.out.println(userSave.getUsername());
		} catch (UserFoundException exception) {
			exception.printStackTrace();
		}*/
	}
}
