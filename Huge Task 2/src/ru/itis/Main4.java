package ru.itis;

import java.util.Scanner;

public class Main4 {
    public static void progression(int f,int s, int n) {
        int k = 1;
        while (f < n) {
            f += s;
            k++;
        }
        if (f != n) {
            System.out.println("-1");
        } else {
            System.out.println(k);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int s = scanner.nextInt();
        int n = scanner.nextInt();

        progression(f,s,n);
    }
}
