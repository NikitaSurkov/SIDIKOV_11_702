package ru.itis;

import java.time.LocalTime;

public class ParkPlace {
    private String carPlace;
    private int count = 0;
    private int limit = 2;
    private Transport[] cars = new Car[limit];

    LocalTime beginTime = LocalTime.parse("09:00:00");
    LocalTime finishTime = LocalTime.parse("21:00:00");

    public ParkPlace(String carPlace) {
        setCarPlace(carPlace);
    }

    public void park(Transport transport) {
        if (LocalTime.now().isAfter(beginTime) && LocalTime.now().isBefore(finishTime)) {
            //if (transport.getParkNumber() == -1) {
                if (count < limit) {
                    for (int i = 0; i < cars.length; i++) {
                        if (cars[i] == null) {
                            //cars[i] = transport;
                            transport.setParkNumber(i);
                            count++;
                            break;
                        }
                    }
                    System.out.println(transport.getModel() + " припаркована");
                } else {
                    System.err.println("На парковке нет мест");
                }
            //} else {
                //System.out.println(transport.getModel() + " уже припаркована");
            //}
        } else {
            System.err.println("Парковка не работает");
        }
    }

    public void parkOff(Transport transport) {
        if (LocalTime.now().isAfter(beginTime) && LocalTime.now().isBefore(finishTime)) {
            //if (cars[transport.getParkNumber()] == transport) {
                //cars[transport.getParkNumber()] = null;
                //transport.setParkNumber(-1);
                System.out.println(transport.getModel() + " выехала");
                count--;
            //} else {
                //System.out.println(transport.getModel() + " не припаркована на этой парковке");
            //}
        } else {
            System.err.println("Парковка не работает");
        }
    }

    public void setCarPlace(String carPlace) {
        this.carPlace = carPlace;
    }
}





