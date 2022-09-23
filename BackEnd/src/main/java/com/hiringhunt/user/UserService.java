package com.hiringhunt.user;



public interface UserService {
	public User register(User userregister);
	public boolean login(User user, String email, String password);
	
	public boolean logout(User user, String email, String password);
	
	public void deleteUser(int userId);
}
