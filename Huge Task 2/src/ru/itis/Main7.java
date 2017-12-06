package ru.itis;

public class Main7 {
    public static void quadraticSum(int n) {
        int s1 = 0;
        int s2 = 0;
        while (n<=100) {
            s1 += n*n;
            s2 += n;
            n++;
        }
        s2 = s2*s2;
        System.out.println(Math.abs(s1 - s2));
    }
    public static void main(String[] args) {
        int n = 1;

        quadraticSum(n);
    }
}
