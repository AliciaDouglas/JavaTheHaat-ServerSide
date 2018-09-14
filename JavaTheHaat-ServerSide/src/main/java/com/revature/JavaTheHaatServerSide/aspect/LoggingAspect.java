package com.revature.JavaTheHaatServerSide.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	private static Logger logger = Logger.getLogger(LoggingAspect.class);

	/**
	 * Add log after throwing for all methods
	 * @param jp
	 * @param e
	 */
	@AfterThrowing(pointcut = "execution(* *(..))", throwing = "e")
	public void afterThrowingLog(JoinPoint jp, Throwable e) {
		System.out.println("hitting after throwing aspect");
		logger.error("Exception in: " + jp.getSignature().getName()
				+ "\n\nThe exception is: "
				+ e.getMessage(), e);
	}
	
	@Before("execution(* *(..))")
	public void beforeThrowing(JoinPoint jp) {
		System.out.println("Before");
	}
	
}
