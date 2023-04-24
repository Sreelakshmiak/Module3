package com.ust.ioc.autowiring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;

public class B {
	A a;
	//A is type..autowiring ..a is a variable..and it is name..search in beans.xml 
	//autowiring :: directly used by the constructor and inject 
	//class should have a constructor with the parameter..
	
	// 
	
	public B(A a) {
		this.a=a;
		System.out.println("from B()constructor..");
	}
	
	
	public B() {
		
	}

@Qualifier("a")
//byName byType will use setter injection
	public void setA(A a) {
		//set method is used to set the value
		System.out.println("setA() called.....");
		this.a=a;
	}
	
	@PostConstruct //this annotation treats the following method as init()
	public void setUp() {
		System.out.println("from setUp()...");
	}

	@PreDestroy
	public void windup() {
		System.out.println("from windup()...");
		
		
	
		
	}

}
