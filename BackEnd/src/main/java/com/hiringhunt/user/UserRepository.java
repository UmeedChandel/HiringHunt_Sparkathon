package com.hiringhunt.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	public List<User> findByEmail(String email);
	

}
