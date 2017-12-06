package ru.itis;

import java.util.Scanner;

public class Main7 {
    public static void isTriangle(int x, int y, int z) {
        if (x + y > z && y + z > x && z + x > y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стороны треугольника:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        isTriangle(x,y,z);
    }
}
