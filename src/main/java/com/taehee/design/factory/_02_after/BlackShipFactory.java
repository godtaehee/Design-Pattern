package com.taehee.design.factory._02_after;

public class BlackShipFactory implements ShipFactory{
  @Override
  public Ship createShip() {
    return new BlackShip();
  }
}
