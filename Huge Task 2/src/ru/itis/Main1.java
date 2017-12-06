package ru.itis;

import java.util.Scanner;

public class Main1 {
    public static int sum(int n) {
        int s = 0;
        if (n > 0) {
            n = n - 1;
            n += sum(n);
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(sum(n));
    }
}
