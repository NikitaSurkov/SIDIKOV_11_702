package ru.itis;

import java.util.Scanner;

public class Main11 {
    public static void division(int n, int k) {
        double q = 0;
        double s = 0;
        while (n > 0) {
            s += (n % 10) * Math.pow(2,q);
            n = n / 10;
            q++;
        }
        if (s % k == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        division(n,k);
    }
}
