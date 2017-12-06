package ru.itis;

import java.util.Scanner;

public class Main14 {
    public static void parse(int x) {
        if ((x / 100000) + (x / 10000 % 10) + (x / 1000 % 10) == (x % 10) + (x % 100 / 10) + (x % 1000 / 100)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер билета");
        int x = scanner.nextInt();

        parse(x);
    }
}
