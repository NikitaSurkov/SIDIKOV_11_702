package ru.itis;

import java.util.Scanner;

public class Main15 {
    public static void count(int n, int k) {
        int [] a = new int[10];
        while (n > 0) {
            a[(n % k)-1]++;
            n /= k;
        }
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                n = i;
            }
        }
        System.out.println(n+1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        count(n,k);
    }
}
