package com.spring.core;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bank implements InitializingBean, DisposableBean {
    private String name;
    private Map<String, DebitCard> debitCards;
    private List<Loan> loans;

    // Constructor with dependencies
    public Bank(String name, Map<String, DebitCard> debitCards, List<Loan> loans) {
        this.name = name;
        this.debitCards = debitCards;
        this.loans = loans;
    }

    // Getter and Setter for the 'name' property
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for the 'debitCards' property
    public Map<String, DebitCard> getDebitCards() {
        return debitCards;
    }

    public void setDebitCards(Map<String, DebitCard> debitCards) {
        this.debitCards = debitCards;
    }

    // Getter and Setter for the 'loans' property
    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    /**
     * method to demonstrate initilization of bean
     * 
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bank bean");
    }

    /**
     * method to call when the use of bean is completed
     * 
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying Bank bean");
    }
}
