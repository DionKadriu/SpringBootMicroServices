package com.example.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//need to add the mysql driver
@SpringBootApplication
public class CustomerApplication {

  public static void main(String[] args) {
    SpringApplication.run(CustomerApplication.class, args);
  }

}
