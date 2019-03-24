package main.java;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;


/**
 * A springboot app doesn't need to be deployed separately on a server
 * but it requires a 'main' method which will be start the servlet container, host the app etc.
 *
 * @SpringBootApplication - will tell spring that this class is the starting point for our app */

@SpringBootApplication
public class A_SpringbootApp {
    public static void main(String[] args) {

        //this line will tell Springboot that a servlet container needs to be created and this app needs to be hosted in this servlet
        // the 'static method run' helps with this and takes in two args : run(<the springboot class>, <command line args>)
        SpringApplication.run(A_SpringbootApp.class, args);
    }
}
