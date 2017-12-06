package ru.itis;

import java.util.Scanner;

public class Main1 {
    public static void color(int x, int y) {
        if (x % 2 != 0) {
            if (y % 2 != 0) {
                System.out.println("Black");
            }
            if (y % 2 == 0) {
                System.out.println("White");
            }
        }
        if (x % 2 == 0) {
            if (y % 2 != 0) {
                System.out.println("White");
            }
            if (y % 2 == 0) {
                System.out.println("Black");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X:");
        int x = scanner.next().charAt(0) - 'a' + 1;
        System.out.println("Введите Y:");
        int y = scanner.nextInt();
        color(x,y);
    }
}
