package com.cts.SpringProj;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

@SuppressWarnings("resource")
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcon.xml");

Teacher tech= context.getBean("Teacher",Teacher.class);

       tech.work();
    }
}

        
        
    