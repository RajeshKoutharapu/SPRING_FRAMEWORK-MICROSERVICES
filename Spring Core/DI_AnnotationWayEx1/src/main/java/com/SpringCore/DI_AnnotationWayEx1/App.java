package com.SpringCore.DI_AnnotationWayEx1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("Configaration.xml");
           Flipcart obj=(Flipcart)context.getBean("Flipcartbean");
           obj.Getservice();
        System.out.println("hello ");
    }
}
