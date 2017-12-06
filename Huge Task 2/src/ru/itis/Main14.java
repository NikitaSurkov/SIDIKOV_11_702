package ru.itis;

import java.util.Scanner;

public class Main14 {
    public static void count(int n,int k) {
        int p = 1;
        while (n > 0){
            p *= n % k;
            n = n / k;
        }
        System.out.println(p);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        count(n,k);
    }
}

