package com.SpringAop.SpringAopEg.Aop;

import java.time.LocalTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class implaop {
	@Before(value = "execution(* com.SpringAop.SpringAopEg.servicelayer.*.*(..))")
  public void beforerunning(JoinPoint join) {
	   System.out.println("ReQuest passed to service layer ---------"+join.getSignature()+LocalTime.now());
  }
	@Before(value = "execution(* com.SpringAop.SpringAopEg.servicelayer.*.*(..))")
	  public void afterrunning(JoinPoint join) {
		   System.out.println("Response passed to controller layer ---------"+join.getSignature()+LocalTime.now());
	  }
//	@Around(value = "execution(* com.SpringAop.SpringAopEg.servicelayer.*.*(..))")
//	  public void bothrunning(JoinPoint join) {
//		   System.out.println("Around passed to service layer ---------"+join.getSignature()+LocalTime.now());
//	  }
	
}
