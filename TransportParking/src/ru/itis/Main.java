package ru.itis;

public class Main {
    public static void main(String[] args) {
        ParkPlace parkOne = new ParkPlace("One");
        Car car = new Car("Lada Granta", 15);
        Sportcar sportcar = new Sportcar("Bugatti", 10);
        Plane plane = new Plane("Boeing", 50);
        Tank tank = new Tank("Armata", 100);
        Belarus belarus = new Belarus("Best Tractor In The United States Of Belarus", 90, -5);

        sportcar.parkCar(parkOne);
        sportcar.parkCarOff(parkOne);
        sportcar.parkCar(parkOne);

        belarus.parkCar(parkOne);

        Transport.move(tank, 10 );
    }
}
