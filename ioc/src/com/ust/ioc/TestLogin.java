package com.ust.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestLogin {

	public static void main(String[] args) {
//		Login log=new Login();
//		log.setUsername("john doe");
//		log.setPassword("MegAminaSreeNajaJoshFasuAnwar");
//		String result=log.validate();
//		System.out.println(result);
		// TODO Auto-generated method stub
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
		Object obj=factory.getBean("connection");
		System.out.println(obj);
		Object obj2=factory.getBean("login");
		Login login=(Login)obj2;
		login.validate();
	}

}
