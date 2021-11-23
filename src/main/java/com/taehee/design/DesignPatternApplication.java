package com.taehee.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

  public static void main(String[] args) {

    Settings settings1 = Settings.getInstance();
    Settings settings2 = Settings.getInstance();

    System.out.println(settings1 != settings2);


  }

}
