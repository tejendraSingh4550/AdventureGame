package com.adventuregame.service;

import com.adventuregame.model.Enemy;
import com.adventuregame.model.Player;

public class BattleService {

    public void fight(Player player, Enemy enemy) {

        System.out.println("\n==================================");
        System.out.println("Battle Started!");
        System.out.println("Enemy : " + enemy.getName());
        System.out.println("==================================");

        while (player.getHealth() > 0 && enemy.isAlive()) {

            // Player attacks
            System.out.println("\n" + player.getName() + " attacks " + enemy.getName());
            enemy.takeDamage(player.getAttack());

            System.out.println(enemy.getName() + " Health : " + enemy.getHealth());

            if (!enemy.isAlive()) {
                System.out.println("\nYou defeated " + enemy.getName() + "!");
                break;
            }

            // Enemy attacks
            System.out.println(enemy.getName() + " attacks " + player.getName());

            player.takeDamage(enemy.getAttack());

            System.out.println(player.getName() + " Health : " + player.getHealth());

            if (player.getHealth() <= 0) {
                System.out.println("\nGame Over!");
                break;
            }
        }
    }
}