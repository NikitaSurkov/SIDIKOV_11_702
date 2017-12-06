package ru.itis;

public class Player {
    String name;
    int hp;

    public Player (String name){
        hp = 100;
        this.name = name;
    }
    public void toAttack(int n, Game game, Enemy enemy) {
        game.attackMe(n, this, enemy);
    }
    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
}
