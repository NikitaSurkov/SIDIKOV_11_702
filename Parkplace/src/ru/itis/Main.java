package ru.itis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkPlace parkPlace = new ParkPlace();
        int n = 0;
        int m = 0;
        do {
            System.out.println("Введите номер машины");
            System.out.println("Или введите 0, чтобы выйти из программы");
            n = scanner.nextInt();
            if (n != 0 ) {
                System.out.println("Чтобы припарковаться, нажмите 1");
                System.out.println("Чтобы уехать, нажмите 2");
                m = scanner.nextInt();
                if (m == 1) {
                    parkPlace.park(n);
                }
                if (m == 2) {
                    parkPlace.parkOff(n);
                }
                System.out.println(" ");
            }
        } while (n != 0);
    }
}
