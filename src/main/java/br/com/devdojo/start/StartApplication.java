package br.com.devdojo.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration

public class StartApplication {
    public static void main(String[] args){
        SpringApplication.run(StartApplication.class, args);
    }
}
