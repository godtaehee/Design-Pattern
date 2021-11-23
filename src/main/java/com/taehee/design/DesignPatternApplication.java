package com.taehee.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@SpringBootApplication
public class DesignPatternApplication {

  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

    Settings settings = Settings.getInstance();

    Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    Settings reflectionInstance = constructor.newInstance();

    System.out.println(settings == reflectionInstance);

  }
}
