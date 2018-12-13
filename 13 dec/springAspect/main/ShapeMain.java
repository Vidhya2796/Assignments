package com.vidhyac.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidhyac.spring.service.ShapeService;

public class ShapeMain 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("shape.xml");
        ShapeService shapeService=context.getBean(ShapeService.class);
        System.out.println(shapeService.getCircle().getName());
        
    }
}
