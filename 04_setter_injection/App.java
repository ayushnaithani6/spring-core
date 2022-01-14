package com.ayush.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
    	
        Alien obj1 = (Alien)cxt.getBean("alien");
        System.out.println(obj1.getAge());
        obj1.code();
    }
}


