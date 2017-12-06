package ru.itis;

import java.util.Scanner;

public class Main10 {
    public static double discriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
    public static void root(double d, double a, double b, double c) {
        if (d < 0){
            System.out.println("Количество действительных корней: 0");
            System.out.println(-1);
        } else{
            if (d == 0){
                System.out.println("1 корень:" + (-b / (2 * a)));
            }
            if (d > 0){
                System.out.print("2 корня:");
                double x1 = ((-b + Math.sqrt(d)) / (2 * a));
                double x2 = ((-b - Math.sqrt(d)) / (2 * a));
                System.out.print(x1 + " и " + x2);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите коэффиценты уравнения:");
        double a = sc.nextDouble();
        double b  = sc.nextDouble();
        double c = sc.nextDouble();

        double d = discriminant(a,b,c);
        root(d,a,b,c);
    }
}
