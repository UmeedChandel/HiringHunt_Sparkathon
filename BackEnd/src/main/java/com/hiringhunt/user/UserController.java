package com.hiringhunt.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
     
	//view HomePage
	@GetMapping("/home")
	public String viewHomePage() {
		return "index";
	}
	
	//For Registering the user 
	@PostMapping("/post")
	public ResponseEntity<User> register(@RequestBody User register)
	{
		

		return new ResponseEntity(userService.register(register), HttpStatus.CREATED);
		
		
	}
	
    //For logging in
	@GetMapping("/login/{email}/{password}")
	public String login(@RequestBody User user, @PathVariable("email") String email,
			@PathVariable("password") String password) {
		if (userService.login(user, email, password) == true) {
			return "Successfully logged in";
		} else {
			return "Invalid credentials!!!!!";
		}
	}
	
    //Logging out
	
	@GetMapping("/logout/{email}/{password}")
	public String logout(@RequestBody User user, @PathVariable("email") String email,
			@PathVariable("password") String password) {
		if (userService.login(user, email, password) == true) {
			return "You are successfully logged out ";
		} else {
			return "Error logging off, check your credentials";
		}
	}
	
	//For deleting the id from the hiring hunt portal
	@DeleteMapping("/delete/{userId}")
	public void deleteUser(@PathVariable("userId")int userId) {	
		userService.deleteUser(userId);
	}
	
	
}
