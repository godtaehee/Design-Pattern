package com.taehee.design.factory._02_after;

public class WhiteShipFactory implements ShipFactory{


  @Override
  public Ship createShip() {
    return new WhiteShip();
  }
}
