package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/context.xml");

        Car car = context.getBean("car", Car.class);

        System.out.println(car.getTireBrand());
    }
}
