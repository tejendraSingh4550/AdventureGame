package com.adventuregame.util;

import java.util.Scanner;

public class InputUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        return scanner.nextInt();
    }

    public static String getString() {
        scanner.nextLine(); // Clear buffer
        return scanner.nextLine();
    }

    public static void closeScanner() {
        scanner.close();
    }
}