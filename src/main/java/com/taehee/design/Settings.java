package com.taehee.design;

public class Settings {

  private Settings() {}

  private static class SettingsHolder {
    private static final Settings INSTANCE = new Settings();
  }

  public static Settings getInstance() {
    return SettingsHolder.INSTANCE;
  }
}

// Lazy 하게 만들것이고, volatile이라는 키워드도 필요없게 해야한다.
//