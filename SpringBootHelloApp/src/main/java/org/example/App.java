package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/*@SpringBootConfiguration//Class provides application configuration,primary(apply to class with main method)source for configuration within application
@EnableAutoConfiguration//Automatically configures
@ComponentScan//Tells SpringBoot to scan the current package for injectable beans
*/
@SpringBootApplication//Can use this annotation instead of using all three of the other ones
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);//Use this method to run this class
        System.out.println("Hello World!");//result of run method
        }
    }
