package ru.itis;

public class Transport {
    private String model;
    private int fuelConsumption;
    private int spentFuel;

    int parkNumber = -1;

    public Transport(String model, int fuelConsumption){
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.spentFuel = 0;
    }

    public String getModel() {
        return model;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getConsumption() {
        return spentFuel;
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

    public static void move(Transport transport, int length){
        transport.spentFuel += length * transport.getFuelConsumption();
        System.out.println(transport.getModel() + " израсходовал " + transport.getConsumption() + " литров топлива");
    }
}