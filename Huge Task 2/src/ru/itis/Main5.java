package ru.itis;

import java.util.Scanner;

public class Main5 {
    public static void progression(double n1,double n2, double d) {
        double sum = 0;
        while (n1 <= n2) {
            sum += n1;
            n1 = n1+d;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double d = scanner.nextDouble();
        System.out.println(((n2-n1)/d)+1);

        progression(n1,n2,d);
    }
}
