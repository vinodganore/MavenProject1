package org.vinod.ganore;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMainClass {
    public static void main(String args[])
    {
       SpringApplication.run(SpringBootMainClass.class , args);
       System.out.println("welcome to Spring boot application");
    }
}
