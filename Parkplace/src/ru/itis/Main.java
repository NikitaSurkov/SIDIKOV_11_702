package ru.itis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ParkPlace parkOne = new ParkPlace("One");
        ParkPlace parkTwo = new ParkPlace("Two");

        Car firstCar = new Car("Lada Granta", "pink");
        Car secondCar = new Car("Mercedes-Benz", "blue");
        Car thirdCar = new Car("Hummer H2", "red");
        Car fourthCar = new Car("Chevrolet Camaro", "yellow");

        firstCar.parkCar(parkOne);
        firstCar.parkCar(parkOne);

        secondCar.parkCar(parkOne);
        thirdCar.parkCar(parkOne);

        firstCar.parkCarOff(parkOne);
        fourthCar.parkCar(parkOne);
        fourthCar.parkCar(parkTwo);
    }
}