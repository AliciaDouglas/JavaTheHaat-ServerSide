package com.revature.JavaTheHaatServerSide.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.JavaTheHaatServerSide.beans.Users;
import com.revature.JavaTheHaatServerSide.service.UsersService;

@RestController
public class UsersCtrl {
	
//	@Autowired
//	UsersService userService;
	
	/**
	 * Takes in a users login information and checks to see if they match a user in the db
	 * @param user
	 * @return
	 */
	@PostMapping("/login")
	public String login(@RequestBody Users user) {
		System.out.println("login -POST");
//		user = userService.login(user);
		return "/login";
	}
	
	/**
	 * Takes in a new user object to register user
	 * @param user
	 * @return
	 */
	@PostMapping("/users")
	public String registerUser(@RequestBody Users user) {
		System.out.println("register -POST");
//		user = userService.registerUser(user);
		return "/users -POST";
	}
	
	/**
	 * takes in a user id and returns a user object
	 * @param id
	 * @return
	 */
	@GetMapping("/users/{id}")
	public String getUserById(@PathVariable int id) {
		System.out.println("getUsersById -GET");
//		Users user = userService.getUserById(id);
		return "/users/{id} -GET" + id;
	}
	
	/**
	 * Takes in a user object and updated database to match new values using uId
	 * @param user
	 * @return
	 */
	@PutMapping("/users")
	public String updateUserInfo(@RequestBody Users user) {
		System.out.println("updateUsersInfo");
//		user = userService.updateUserInfo(user);
		return "/users -PUT";
	}

}
