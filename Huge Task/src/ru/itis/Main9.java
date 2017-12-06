package ru.itis;

import java.util.Scanner;

public class Main9 {
    public static void quadraticEquation(int a, int b, int c) {
        if (a != 0) {
            System.out.print(a + "x^2");
        }
        if (b != 0) {
            if ((b > 0)) {
                System.out.print("+");
            }
            System.out.print(b + "x");
        }
        if (c != 0) {
            if ((c > 0)) {
                System.out.print("+");
            }
            System.out.print(c);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коэффиценты уравнения:");
        int a  = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        quadraticEquation(a,b,c);

    }
}
