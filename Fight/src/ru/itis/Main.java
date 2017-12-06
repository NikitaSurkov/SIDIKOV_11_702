package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        Player p1 = new Player(sc.nextLine());
        Enemy e1 = new Enemy("Dimon");
        int n = 0;
        int b = 9;
        while (game.getGameIsOn() == 1) {


            n = sc.nextInt();
            p1.toAttack(n,game,e1);

            n = rnd.nextInt(b);
            while (n == 0) {
                n = rnd.nextInt(b);
            }
            e1.toAttack(n,game,p1);
        }
    }
}
