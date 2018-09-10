package com.revature.JavaTheHaatServerSide.repository;

import org.springframework.data.repository.CrudRepository;

import com.revature.JavaTheHaatServerSide.beans.Users;

public interface UsersRepo extends CrudRepository<Users, Integer>{
	
	Users findByUId(int uId);

}
