package com.revature.JavaTheHaatServerSide.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.JavaTheHaatServerSide.JavaTheHaatServerSideApplication;
import com.revature.JavaTheHaatServerSide.JavaTheHaatServerSideApplicationTests;

import io.restassured.RestAssured;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=JavaTheHaatServerSideApplicationTests.class)
@ContextConfiguration(classes=JavaTheHaatServerSideApplication.class)
public class Tests extends JavaTheHaatServerSideApplicationTests{
	
	static String url = "http://localhost:8080";
	
	@Test
	public void canGetAllUsers() {
		RestAssured.get(url + "/users").prettyPrint();
	}

}
