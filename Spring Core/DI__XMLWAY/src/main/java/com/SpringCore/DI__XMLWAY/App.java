package com.SpringCore.DI__XMLWAY;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
         Targetclass tr=(Targetclass)context.getBean(Targetclass.class);
         System.out.println("REDBUS\nABHI BUS\nAPSRTC");
         tr.booktickets();
         
        
    }
}
