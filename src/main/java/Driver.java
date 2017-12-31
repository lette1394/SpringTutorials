package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context002.xml");

        Tire tire = context.getBean("koreaTire", Tire.class);
        Car car = context.getBean("car", Car.class);
        car.setTire(tire);

        System.out.println(car.getTireBrand());
    }
}
