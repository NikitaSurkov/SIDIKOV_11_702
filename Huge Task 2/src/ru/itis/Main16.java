package ru.itis;

import java.util.Scanner;

public class Main16 {
    public static void count(int n, int k) {
        int max1 = 0;
        int max2 = 0;
        while (n > 0) {
            if (n % k == 0) {
                max1++;
            }
            if (n % k != 0) {
                if (max1 > max2) {
                    max2 = max1;
                    max1 = 0;
                }
            }
            n = n / k;
        }
        System.out.println(max2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        count(n,k);
    }
}
