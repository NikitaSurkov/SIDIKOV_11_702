package ru.itis;

import java.util.Scanner;

public class Main4 {
    public static void rook(int x1, int x2, int y1, int y2) {
        if ((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X1:");
        int x1 = scanner.next().charAt(0) - 'a' + 1;
        System.out.println("Введите Y1:");
        int y1 = scanner.nextInt();
        System.out.println("Введите X2:");
        int x2 = scanner.next().charAt(0) - 'a' + 1;
        System.out.println("Введите Y2:");
        int y2 = scanner.nextInt();
        rook(x1,x2,y1,y2);
    }
}
