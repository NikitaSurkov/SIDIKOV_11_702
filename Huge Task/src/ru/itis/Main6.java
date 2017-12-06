package ru.itis;

import java.util.Scanner;

public class Main6 {
    public static void year(int x) {
        if ((x % 400 == 0) || (x % 4 == 0 && x % 100 != 0)) {
            System.out.format("12/09/%04d",x);
        } else {
            System.out.format("13/09/%04d",x);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int x = scanner.nextInt();
        year(x);
    }
}
