package ru.itis;

public class Car {

    private int num;
    private ParkPLace parkPlace;

    public void driveIn(){
        parkPlace.park(this);
    }
    public void driveOut(){

    }
}
