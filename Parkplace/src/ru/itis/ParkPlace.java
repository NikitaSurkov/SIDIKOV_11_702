package ru.itis;

import java.time.LocalTime;

public class ParkPlace {


    private Car cars[];
    private int count = 0;

    public void parking(Car car) {
        cars[count] = car;
        count++;
    }


    int []car = new int[3];
    int []place = new int[3];

    LocalTime beginTime = LocalTime.parse("08:00:00");
    LocalTime finishTime = LocalTime.parse("21:00:00");

    public ParkPlace() {
        car[0] = 132;
        car[1] = 256;
        car[2] = 333;
        place[0] = 0;
        place[1] = 0;
        place[2] = 0;
    }

    public void park(int n) {
        if (LocalTime.now().isAfter(beginTime) && LocalTime.now().isBefore(finishTime)) {
            if (place[n - 1] == 0) {
                System.out.println("Паркуемся");
                place[n - 1] = 1;
            } else {
                System.out.println("Вы уже припаркованы");
            }
        } else {
            System.out.println("Парковка не работает");
        }
    }
    public void parkOff(int n) {
        if (LocalTime.now().isAfter(beginTime) && LocalTime.now().isBefore(finishTime)) {
            if (place[n-1] == 1) {
                System.out.println("Выезжаем");
                place[n - 1] = 0;
            } else {
                System.out.println("Вы еще не припаркованы");
            }
        } else {
            System.out.println("Парковка не работает");
        }
    }

















}
