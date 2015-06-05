package com.essamine.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.essamine.classes.Personne;

public class Main {
	public static void main(String args[]){
		
//		ApplicationContext ctx=	new ClassPathXmlApplicationContext("spring-beans.xml");
//		Personne p1=(Personne) ctx.getBean("personne");
//		System.out.println(p1);
		
		ApplicationContext ctx2=new ClassPathXmlApplicationContext("spring-beans.xml");
		Personne per2= (Personne) ctx2.getBean("personne2");
		System.out.println(per2);
	
	}

}
