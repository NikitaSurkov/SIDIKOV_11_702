package ru.itis;

public class Enemy {
    String name;
    int hp;

    public Enemy(String name) {
        hp = 100;
        this.name = name;
    }
    public void toAttack(int n, Game game, Player player) {
        game.attackHim(n, player, this);
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
