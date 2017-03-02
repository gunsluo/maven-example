package com.jerrylou.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jerrylou on 3/2/17.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Test obj = (Test) context.getBean("helloBean");
        obj.printHello();
    }
}
