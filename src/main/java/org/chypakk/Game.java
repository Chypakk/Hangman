package org.chypakk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {

    public static void start() {
        final int MAX_ERRORS = 6;
        int errorCount = 0;

        List<Character> errorChars = new ArrayList<>();

        String secretWord = ChooseWord.get();
        char[] secretWordView = new char[secretWord.toCharArray().length];
        Arrays.fill(secretWordView, '_');

        char inputChar;
        boolean gameLoop = true;

        while (gameLoop) {
            Hangman.draw(errorCount);
            System.out.println("Слово " + Arrays.toString(secretWordView));
            System.out.println("Ошибки " + errorChars);

            inputChar = Main.getChar();

            if (!checkChar(inputChar)) continue;

            if (secretWord.contains(String.valueOf(inputChar))) {
                for (int i = 0; i < secretWordView.length; i++) {
                    if (secretWord.charAt(i) == inputChar) {
                        secretWordView[i] = inputChar;
                    }
                }
            } else if (!errorChars.contains(inputChar)){
                errorCount++;
                errorChars.add(inputChar);
            }

            if (errorCount == MAX_ERRORS || !String.valueOf(secretWordView).contains("_")) gameLoop = false;
        }

        if (errorCount == MAX_ERRORS) System.out.println("Lose\nСлово - " + secretWord);
        else System.out.println("Win!\nСлово - " + secretWord);

    }

    private static boolean checkChar(char inputChar){
        if (!Character.isLetter(inputChar)){
            System.out.println("Введен неккоректный символ\n");
            return false;
        }

        if (inputChar < 'а' || inputChar > 'я'){
            System.out.println("Используется только кириллица\n");
            return false;
        }

        return true;
    }

}
