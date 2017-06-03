package com.financial.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.financial.model.User;

@Component
public class DatabaseLoader implements CommandLineRunner {
	private final UserRepository userRepository;
	
	@Autowired
	public DatabaseLoader(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public void run(String... strings) throws Exception {
		//this.userRepository.save(new User("280561543@qq.com", "123456", "ROLE_USER"));
		//this.userRepository.save(new User("maingben@qq.com", "123456", "ROLE_USER"));
	}
}