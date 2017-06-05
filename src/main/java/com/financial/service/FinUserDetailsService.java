package com.financial.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.financial.repository.UserRepository;
/**
 *
 * @author Maing<280561543@qq.com>
 */
@Service(value = "FinUserDetailsService")
public class FinUserDetailsService implements UserDetailsService{
    private final UserRepository userRepository;

	@Autowired
	public FinUserDetailsService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		com.financial.model.User user = this.userRepository.findByEmail(email);
		return new User(user.getEmail(), user.getPassword(),
			AuthorityUtils.createAuthorityList(user.getRoles()));
	}
}