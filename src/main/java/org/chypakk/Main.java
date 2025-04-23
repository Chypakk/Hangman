package org.chypakk;


import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String answer;
        while (true) {
            System.out.println("Начать новую игру (да/нет)?");
            answer = scanner.nextLine();
            switch (answer){
                case "да":
                case "д":
                case "yes":
                case "y":
                    Game.start();
                    break;

                case "нет":
                case "н":
                case "no":
                case "n":
                    scanner.close();
                    return;

            }

        }
    }

    public static Character getChar() {
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("") ? '-' : input.charAt(0);
    }
}