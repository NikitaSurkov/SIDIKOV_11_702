package ru.itis;

import java.util.Scanner;

public class Main2 {
    public static void progression(int n1,int n2, int k) {
        System.out.println((n2-n1)*(k-1)+n1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int k = scanner.nextInt();

        progression(n1,n2,k);
    }
}
