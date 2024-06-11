package com.SpringCore.PureAnnotationWayex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.SpringCore.Configurationfile.Configurationclass;
import com.SpringCore.Service.GreetME;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext container=new AnnotationConfigApplicationContext(Configurationclass.class);
       GreetME obj=container.getBean(GreetME.class);
       obj.generategreetings();
    }
}
