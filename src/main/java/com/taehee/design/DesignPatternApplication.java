package com.taehee.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@SpringBootApplication
public class DesignPatternApplication {

  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

    Settings settings = Settings.INSTANCE;

    Settings settings1 = null;

    Constructor<?>[] declaredConstructors = Settings.class.getDeclaredConstructors();
    for (Constructor<?> constructor : declaredConstructors) {
      constructor.setAccessible(true);
      settings1 = (Settings) constructor.newInstance("INSTANCE");

    }

    System.out.println(settings == settings1);
  }
}

