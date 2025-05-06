package com.nikhil.Project;

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
        System.out.println( "hi its my first application" );
        Vehicle obj = new Car();
        obj.drive();
    }
}
