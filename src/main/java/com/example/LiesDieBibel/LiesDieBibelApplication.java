package com.example.LiesDieBibel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class LiesDieBibelApplication {

  public static void main(String[] args) {
    SpringApplication.run(LiesDieBibelApplication.class, args);
  }
}
