package com.hiringhunt.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
     
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User register(User userregister) {
		
		return userRepository.save(userregister);
	}

	@Override
	public boolean login(User user, String email, String password) {
		String emailid=user.getEmail();
		String pwd=user.getPassword();
		if (emailid.equals(email) && pwd.equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	

	@Override
	public boolean logout(User user, String email, String password) {
		String emailid = user.getEmail();
		String pwd = user.getPassword();
		if (emailid.equals(email) && pwd.equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void deleteUser(int userId) {
		userRepository.deleteById(userId);
		
	}

	

}
