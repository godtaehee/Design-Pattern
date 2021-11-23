package com.taehee.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@SpringBootApplication
public class DesignPatternApplication {

  public static void main(String[] args) throws IOException, ClassNotFoundException {

    Settings settings = Settings.getInstance();
    Settings settings1 = null;

    try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
      out.writeObject(settings);
    }

    try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
      settings1 = (Settings) in.readObject();
    }

    System.out.println(settings == settings1);

  }
}

// 자바는 오브젝트를 파일 형태로 디스크에 저장(직렬화)해놨다가 다시 읽을수가있다(역직렬화)