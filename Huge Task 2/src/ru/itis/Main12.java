package ru.itis;

import java.util.Scanner;

public class Main12 {
    public static void division(int num1, int num2, int n, int k) {
        int s = 0;
        int count = 1;
        while (num1 > 0) {
            s += (num1 % n)*count;
            num1 = num1 / n;
            count *= 10;
        }
        System.out.println(s);
        s = 0;
        count = 1;
        while (num2 > 0) {
            s += (num2 % k)*count;
            num2 = num2 / k;
            count *= 10;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        division(num1,num2,n,k);
    }
}
