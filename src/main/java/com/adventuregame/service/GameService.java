package com.adventuregame.service;

import com.adventuregame.model.Enemy;
import com.adventuregame.model.Item;
import com.adventuregame.model.Room;

public class GameService {

    public Room createForest() {

        Enemy goblin = new Enemy("Goblin", 40, 10);
        Item sword = new Item("Sword", "Weapon", 15);

        return new Room(
                "Forest",
                "A dark forest filled with dangerous creatures.",
                goblin,
                sword
        );
    }

    public Room createRiver() {

        Enemy wolf = new Enemy("Wolf", 60, 15);
        Item potion = new Item("Potion", "Health", 30);

        return new Room(
                "River",
                "A peaceful river surrounded by trees.",
                wolf,
                potion
        );
    }

    public Room createCave() {

        Enemy dragon = new Enemy("Dragon", 120, 25);
        Item treasure = new Item("Treasure", "Reward", 100);

        return new Room(
                "Dark Cave",
                "A mysterious cave where the Dragon lives.",
                dragon,
                treasure
        );
    }
}