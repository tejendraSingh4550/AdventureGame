package com.adventuregame.game;

import java.util.Scanner;

public class Game {

    private Scanner scanner = new Scanner(System.in);

    public void start() {

        System.out.println("======================================");
        System.out.println("      WELCOME TO ADVENTURE GAME");
        System.out.println("======================================");

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        System.out.println("\nWelcome, " + playerName + "!");
        System.out.println("Your adventure begins now...\n");

        boolean running = true;

        while (running) {

            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Enter Forest");
            System.out.println("2. Go to River");
            System.out.println("3. Enter Cave");
            System.out.println("4. View Inventory");
            System.out.println("5. View Status");
            System.out.println("6. Exit Game");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nYou entered the Forest.");
                    System.out.println("A Goblin appears!");
                    break;

                case 2:
                    System.out.println("\nYou reached the River.");
                    System.out.println("You found fresh water.");
                    break;

                case 3:
                    System.out.println("\nYou entered the Dark Cave.");
                    System.out.println("You hear strange sounds...");
                    break;

                case 4:
                    System.out.println("\nInventory is empty.");
                    break;

                case 5:
                    System.out.println("\nPlayer Status");
                    System.out.println("Health : 100");
                    System.out.println("Gold   : 0");
                    break;

                case 6:
                    System.out.println("\nThanks for playing Adventure Game!");
                    running = false;
                    break;

                default:
                    System.out.println("\nInvalid Choice!");
            }

        }

        scanner.close();
    }
}