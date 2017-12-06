package ru.itis;

import java.time.LocalTime;

public class ParkPlace {
    private String carPlace;
    private int count = 0;
    private int limit = 2;
    private Car[] cars = new Car[limit];

    LocalTime beginTime = LocalTime.parse("09:00:00");
    LocalTime finishTime = LocalTime.parse("21:00:00");

    public ParkPlace(String carPlace) {
        setCarPlace(carPlace);
    }

    public void park(Car car) {
        if (LocalTime.now().isAfter(beginTime) && LocalTime.now().isBefore(finishTime)) {
            if (car.getParkNumber() == -1) {
                if (count < limit) {
                    for (int i = 0; i < cars.length; i++) {
                        if (cars[i] == null) {
                            cars[i] = car;
                            car.setParkNumber(i);
                            count++;
                            break;
                        }
                    }
                    System.out.println(car.getModel() + " припаркована");
                } else {
                    System.err.println("На парковке нет мест");
                }
            } else {
                System.out.println(car.getModel() + " уже припаркована");
            }
        } else {
            System.err.println("Парковка не работает");
        }
    }

    public void parkOff(Car car) {
        if (LocalTime.now().isAfter(beginTime) && LocalTime.now().isBefore(finishTime)) {
            if (cars[car.getParkNumber()] == car) {
                cars[car.getParkNumber()] = null;
                car.setParkNumber(-1);
                System.out.println(car.getModel() + " выехала");
                count--;
            } else {
                System.out.println(car.getModel() + " не припаркована на этой парковке");
            }
        } else {
            System.err.println("Парковка не работает");
        }
    }

    public String getCarPlace() {
        return carPlace;
    }
    public void setCarPlace(String carPlace) {
        this.carPlace = carPlace;
    }



















}
