package com.adventuregame.model;

public class Room {

    private String roomName;
    private String description;
    private Enemy enemy;
    private Item item;

    public Room(String roomName, String description, Enemy enemy, Item item) {
        this.roomName = roomName;
        this.description = description;
        this.enemy = enemy;
        this.item = item;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getDescription() {
        return description;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public Item getItem() {
        return item;
    }

    public void enterRoom() {

        System.out.println("\n================================");
        System.out.println("Location : " + roomName);
        System.out.println("================================");
        System.out.println(description);

        if (enemy != null) {
            System.out.println("\nEnemy Found : " + enemy.getName());
        }

        if (item != null) {
            System.out.println("Item Found : " + item.getName());
        }
    }
}