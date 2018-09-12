package com.revature.JavaTheHaatServerSide.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.JavaTheHaatServerSide.beans.Users;
import com.revature.JavaTheHaatServerSide.email.Email;
import com.revature.JavaTheHaatServerSide.repository.UsersRepo;

@Service
public class UsersService {

	@Autowired
	UsersRepo usersRepo;
	
	/**
	 * Takes in a Users object and sends to DAO to see if user exists
	 * @param user
	 * @return user
	 */
	public Users login(Users user) {
		System.out.println("user service - login");
		Users loginUser = usersRepo.findByEmail(user.getEmail());
		if (loginUser != null && user.getPassword().equals(loginUser.getPassword())) {
			return loginUser;
		}
		return null;
	}

	
	/**
	 * Takes in a user object and send to DAO to insert new user into DB
	 * @param user
	 * @return user
	 */
	public Users registerUser(Users user) {
		Users newUser = new Users();
		String randomPassword = generateRandomString();
		if (user.getAccTypeId() == 2) {
			user.setPassword(randomPassword);
			newUser = usersRepo.save(user);
			Email.newAdminEmail(newUser);
		} else {
			newUser = usersRepo.save(user);
		}
		return newUser;
	}
	
	/**
	 * Creates a randomly generated String
	 * @return
	 */
	public String generateRandomString() {
		int leftLimit = 33; 
	    int rightLimit = 126; 
	    int targetStringLength = 10;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();
	 
	    System.out.println(generatedString);
	    return generatedString;
	}

	
	/**
	 * Takes in a user id and sends to DAO to get the user information from that id
	 * @param id
	 * @return
	 */
	public Users getUserById(int id) {
		return usersRepo.findByUId(id);
	}

	/**
	 * Takes in a user object and sends to DAO to update database based on uId
	 * @param user
	 * @return
	 */
	public Users updateUserInfo(Users user) {
		return usersRepo.save(user);
	}

	/**
	 * Get all users
	 * @return
	 */
	public List<Users> getAllUsers() {
		return (List<Users>) usersRepo.findAll();
	}

}
