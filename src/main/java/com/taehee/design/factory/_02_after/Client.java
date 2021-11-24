package com.taehee.design.factory._02_after;

public class Client {

  public static void main(String[] args) {
    Ship whiteship = WhiteShipFactory.orderShip("Whiteship", "keesun@mail.com");
    System.out.println(whiteship);

    Ship blackship = WhiteShipFactory.orderShip("Blackship", "keesun@mail.com");
    System.out.println(blackship);
  }
}