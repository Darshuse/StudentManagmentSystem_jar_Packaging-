package com.boubyan.me.Student_Managment_System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boubyan.me.Student_Managment_System.entity.User;
import com.boubyan.me.Student_Managment_System.exception.UserNotFoundException;
import com.boubyan.me.Student_Managment_System.repository.UserRepository;

@Service("detailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepo;

	@Override
	@Transactional
	public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepo.findByFirstName(userName)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + userName));
		return UserDetailsImpl.build(user);
	}

}
