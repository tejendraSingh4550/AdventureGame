package com.adventuregame.model;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private int health;
    private int attack;
    private int gold;
    private List<String> inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.attack = 20;
        this.gold = 0;
        this.inventory = new ArrayList<>();
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

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void takeDamage(int damage) {
        health -= damage;

        if (health < 0) {
            health = 0;
        }
    }

    public void heal(int amount) {
        health += amount;

        if (health > 100) {
            health = 100;
        }
    }

    public void increaseAttack(int value) {
        attack += value;
    }

    public void addItem(String item) {
        inventory.add(item);
    }

    public void showInventory() {

        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        System.out.println("\n===== Inventory =====");

        for (String item : inventory) {
            System.out.println("- " + item);
        }
    }

    public void showStatus() {

        System.out.println("\n===== Player Status =====");
        System.out.println("Name   : " + name);
        System.out.println("Health : " + health);
        System.out.println("Attack : " + attack);
        System.out.println("Gold   : " + gold);
    }
}