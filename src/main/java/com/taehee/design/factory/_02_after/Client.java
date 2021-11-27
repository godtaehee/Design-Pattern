package com.taehee.design.factory._02_after;

public class Client {

  public static void main(String[] args) {
    Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "keesun@mail.com");
    System.out.println(whiteship);

    Ship blackship = new BlackShipFactory().orderShip("Blackship", "keesun@mail.com");
    System.out.println(blackship);
  }
}
