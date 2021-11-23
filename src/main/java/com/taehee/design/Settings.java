package com.taehee.design;

public class Settings {
  private Settings() {}

  public static Settings getInstance() {
    return new Settings();
  }
}
