package ru.itis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        car.setModel("Lada Granta XXX");
        car.setColor("Pink");
        car.setNumber("666");
        car.setPower(-50);
        System.out.println(car.getModel());
        System.out.println(car.getPower());
        System.out.println(car.getColor());
        System.out.println(car.getNumber());
        car.go(6);
        System.out.println(car.getMileage());
    }
}
