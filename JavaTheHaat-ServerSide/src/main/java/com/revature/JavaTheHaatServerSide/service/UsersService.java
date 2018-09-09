package com.revature.JavaTheHaatServerSide.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.JavaTheHaatServerSide.beans.Users;
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
		// TODO Auto-generated method stub
		return null;
	}

	
	/**
	 * Takes in a user object and send to DAO to insert new user into DB
	 * @param user
	 * @return user
	 */
	public Users registerUser(Users user) {
		return usersRepo.save(user);
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
