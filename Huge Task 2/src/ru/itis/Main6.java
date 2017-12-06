package ru.itis;

public class Main6 {
    public static void sum(int n) {
        int s = 0;
        while (n <= 1000) {
            if (n % 3 == 0 && n % 5 == 0) {
                s += n;
            }
            n++;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        int n = 1;
        sum(n);
    }
}
