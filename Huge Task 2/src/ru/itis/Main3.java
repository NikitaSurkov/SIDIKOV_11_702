package ru.itis;

import java.util.Scanner;

public class Main3 {
    public static void progression(int n1,int n2, int n) {
        System.out.println((2*n1+(n-1)*(n2-n1))*n/2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n = scanner.nextInt();

        progression(n1,n2,n);
    }
}
