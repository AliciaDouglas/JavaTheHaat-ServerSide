package com.revature.JavaTheHaatServerSide;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=JavaTheHaatServerSideApplicationTests.class)
public class JavaTheHaatServerSideApplicationTests {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
			.sources(JavaTheHaatServerSideApplicationTests.class)
			.run(args);
	}
	
	@Test
	@Ignore
	public void run() {}

}
