package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ref_Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
        A tempa=(A) context.getBean("aref");
         
        System.out.println(tempa.getX());
        
        System.out.println(tempa.getOb().getY());
        
        System.out.println(tempa);
	}

}
