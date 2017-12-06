package ru.itis;

import java.util.Scanner;

public class Main5 {
    public static void isSame(int x1, int x2, int y1, int y2) {
        int a = Math.abs(x1 - x2);
        int b = Math.abs(y1 - y2);
        int c = Math.abs(a - b);
        if (a == b) {
            System.out.println("Same");
        }
        if (c == 1){
            System.out.println("Neighbour");
        }
        if ((a != b) && (c != 1)){
            System.out.println("Not on neighbour or same diagonal");
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
        isSame(x1,x2,y1,y2);
    }
}
