package ru.itis;

import java.util.Scanner;

public class Main8 {
    public static double distance(double x1, double x2, double y1, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 -y1) * (y2 - y1));
    }
    public static void isIntersect(double s, double r1, double r2) {
        if (s > r1 + r2){
            System.out.println("No");
        } else{
            System.out.println("Yes");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();

        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double r2 = scanner.nextDouble();

        double s = distance(x1,x2,y1,y2);

        isIntersect(s,r1,r2);
    }
}
