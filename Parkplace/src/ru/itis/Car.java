package ru.itis;

public class Car {

    private String model;
    private String color;
    private int parkNumber = -1;

    public Car(String model, String color){
        setModel(model);
        setColor(color);
    }

    public int getParkNumber() {
        return parkNumber;
    }

    public void setParkNumber(int parkNumber) {
        this.parkNumber = parkNumber;
    }

    public void parkCar(ParkPlace parkPlace) {
        parkPlace.park(this);
    }
    public void parkCarOff(ParkPlace parkPlace) {
        parkPlace.parkOff(this);
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

}
