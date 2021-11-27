package com.taehee.design.factory._02_after;

public class Client {

  public static void main(String[] args) {

    Client client = new Client();

    client.print(new WhiteShipFactory(), "whiteship", "keesun@mail.com");

    client.print(new BlackShipFactory(), "blackship", "keesun@mail.com");
  }

  private void print(ShipFactory shipFactory, String name, String email) {
    System.out.println(shipFactory.orderShip(name, email));
  }
}
