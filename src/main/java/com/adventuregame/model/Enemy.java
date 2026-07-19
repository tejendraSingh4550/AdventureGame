package com.adventuregame.model;

public class Enemy {

    private String name;
    private int health;
    private int attack;

    public Enemy(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public void takeDamage(int damage) {
        health -= damage;

        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void showEnemyStatus() {
        System.out.println("\n===== Enemy Status =====");
        System.out.println("Name   : " + name);
        System.out.println("Health : " + health);
        System.out.println("Attack : " + attack);
    }
}