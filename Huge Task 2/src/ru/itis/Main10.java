package ru.itis;

import java.util.Scanner;

public class Main10 {
    public static void count(int n) {
        while (n > 0){
            System.out.print(n % 2);
            n = n / 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        count(n);
    }
}
