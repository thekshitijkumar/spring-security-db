package com.example.springsecuritydb;

import com.example.springsecuritydb.models.User;
import com.example.springsecuritydb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import java.util.Arrays;

@SpringBootApplication
public class SpringSecurityDbApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDbApplication.class, args);
	}



	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
//		BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
//		String encodedPwdforuser1=bCryptPasswordEncoder.encode("jacky");
//		String encodedPwdforuser2=bCryptPasswordEncoder.encode("rocky");
//		User u1=User.builder()
//				.username("Jack")
//				.password(encodedPwdforuser1)
//				.authorities("STUDENT:FACULTY")
//				.build();
//		User u2=User.builder()
//				.username("Rocky")
//				.authorities("STUDENT")
//				.password(encodedPwdforuser2)
//				.build();
//
//		userRepository.saveAll(Arrays.asList(u1,u2));

	}
}
