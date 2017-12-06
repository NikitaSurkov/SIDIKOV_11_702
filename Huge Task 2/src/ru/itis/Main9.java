package ru.itis;

import java.util.Scanner;

public class Main9 {
    public static void count(int n) {
        int k = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                k++;
            }
            n = n / 2;
        }
        System.out.println(k);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        count(n);
    }
}
