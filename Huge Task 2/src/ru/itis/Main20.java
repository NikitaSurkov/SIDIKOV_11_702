package ru.itis;

import java.util.Scanner;

public class Main20 {
    public static void count(int n) {
        while (n > 0){
            if (n % 2 == 0) {
                System.out.print(n % 2 + " ");
            }
            n = n / 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        count(n);
    }
}
