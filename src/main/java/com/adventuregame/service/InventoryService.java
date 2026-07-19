package com.adventuregame.service;

import com.adventuregame.model.Player;

public class InventoryService {

    public void addItem(Player player, String itemName) {

        player.addItem(itemName);
        System.out.println(itemName + " added to inventory.");
    }

    public void showInventory(Player player) {

        player.showInventory();
    }

    public boolean hasItem(Player player, String itemName) {

        return false;
    }

    public void removeItem(Player player, String itemName) {

        System.out.println(itemName + " removed from inventory.");
    }
}