package com.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.sio.ClassPathResource;

/**
 * example of using the setter injection with bean factory
 * 
 * @author namanmalhotra
 */
public class BeanFactory {
    public static void main(String[] args) {
        // Load the Spring configuration file
        ClassPathResource resource = new ClassPathResource("beanSetter.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        // Retrieve the Bank bean from the BeanFactory
        Bank bank = (Bank) beanFactory.getBean("bank");
        System.out.println("Bank Name: " + bank.getName());
        System.out.println("Debit Cards: " + bank.getDebitCards());
        System.out.println("Loans: " + bank.getLoans());
    }
}
