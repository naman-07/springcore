package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author namanmalhotra
 * example of using the constructor injection with application context
 */
public class ApplicationContextExample {
    // Load the Spring configuration file and create the application context
    ApplicationContext context = new ClassPathXmlApplicationContext("beanConstructor.xml");

    Bank bank = (Bank) context.getBean("bank");

    System.out.println("Bank Name: " + bank.getName());
    System.out.println("Debit Cards: " + bank.getDebitCards());
    System.out.println("Loans: " + bank.getLoans());
 // Close the application context: it will call the destroy methsod for the bank bean
    ((ClassPathXmlApplicationContext) context).close();
}
