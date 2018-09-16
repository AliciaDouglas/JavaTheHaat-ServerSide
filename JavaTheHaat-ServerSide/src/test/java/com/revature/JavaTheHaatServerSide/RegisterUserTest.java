package com.revature.JavaTheHaatServerSide;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import com.revature.JavaTheHaatServerSide.beans.Users;
import com.revature.JavaTheHaatServerSide.repository.UsersRepo;
import com.revature.JavaTheHaatServerSide.service.UsersService;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment= WebEnvironment.NONE)
public class RegisterUserTest {

	@Mock
	UsersRepo userRepo;
	
	@InjectMocks
	private UsersService userService;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void createUserTest() {
		Users user = new Users();
		user.setFname("Alicia");
		user.setLname("Douglas");
		
		when(userRepo.save(any(Users.class))).thenReturn(user);
		
		Users newUser = userService.registerUser(user);
		System.out.println(newUser);
		
		assertEquals("Alicia", newUser.getFname());
	}
}
