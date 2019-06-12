package br.com.devdojo.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "br.com.devdojo.StudentEndpoint")
public class StartApplication {
    public static void main(String[] args){
        SpringApplication.run(StartApplication.class, args);
    }
}
