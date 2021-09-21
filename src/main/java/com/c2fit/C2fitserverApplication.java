package com.c2fit;

import com.c2fit.models.Role;
import com.c2fit.models.User;
import com.c2fit.models.UserRole;
import com.c2fit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class C2fitserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {

		SpringApplication.run(C2fitserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code...!!");

//		User user = new User();
//
//		user.setFirstname("kaushal");
//		user.setLastname("Bhatt");
//		user.setUsername("kaushal8650@");
//		user.setPassword("1234567");
//		user.setEmail("kaushal8650@gmail.com");
//		user.setAge(26);
//		user.setGender("male");
//		user.setPhone("7310832517");
//
//		Role role1 =new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//				userRole.setRole(role1);
//				userRole.setUser(user);
//				userRoleSet.add(userRole);
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
	}
}
