package ru.itis;

import java.util.Scanner;

public class Main13 {
    public static void count(int n,int k) {
        int sum = 0;
        while (n > 0){
            sum += n % k;
            n = n / k;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        count(n,k);
    }
}
