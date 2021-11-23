package com.taehee.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

  public static void main(String[] args) {
    Settings settings1 = new Settings();
    Settings settings2 = new Settings();

    System.out.println(settings1 != settings2);


  }

}
