package com.revature.JavaTheHaatServerSide.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class LoggingAspect {

	final static Logger logger = Logger.getLogger(LoggingAspect.class);

	@After("execution(* *(..))")
	public void logService(JoinPoint jp) throws Throwable {
		
	}
	
}
