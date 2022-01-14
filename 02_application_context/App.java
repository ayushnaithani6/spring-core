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
        obj1.age = 15;
        System.out.println("Age of obj1: " + obj1.age);
        
        Alien obj2 = (Alien)cxt.getBean("alien");
        System.out.println("Age of obj2: " + obj2.age);
        
        // they both are same by default spring bean is singleton
        System.out.println(obj1);
        System.out.println(obj2);
        
    }
}
 