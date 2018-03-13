package com.info.ScopesDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		NormalEmployee normalEmp = (NormalEmployee) factory.getBean("normalEmp");
		RegularEmployee regEmp = (RegularEmployee) factory.getBean("regularlEmp");
		System.out.println("NormalEmployee Singleton Instance hashcode:" + normalEmp.hashCode()
				+ " with Address Protototype hashcode:" + normalEmp.address.hashCode());
		System.out.println("RegularEmployee Singleton Instance hashcode:" + regEmp.hashCode()
				+ " with Address Protototype hashcode:" + regEmp.address.hashCode());

		NormalEmployee normalEmp1 = (NormalEmployee) factory.getBean("normalEmp");
		System.out.println("NormalEmployee Singleton Instance 1 hashcode:" + normalEmp1.hashCode()
				+ " with Address Protototype hashcode:" + normalEmp1.address.hashCode());

	}

}
