package com.taehee.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@SpringBootApplication
public class DesignPatternApplication {

  public static void main(String[] args) {
    Runtime runtime = Runtime.getRuntime();
    System.out.println(runtime.maxMemory());
    System.out.println(runtime.freeMemory());
  }
}