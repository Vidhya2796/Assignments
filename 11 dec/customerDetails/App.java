package com.vidhyac.customerDetails;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Customer customer=context.getBean(Customer.class);
        customer.showCustDetails();
    }
}
