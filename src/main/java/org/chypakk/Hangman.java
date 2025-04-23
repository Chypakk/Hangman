package org.chypakk;

public class Hangman {

    public static void draw(int mistake){
        switch (mistake){

            case 0 -> System.out.println(
                    """
                               ____
                                  |
                                  |
                                  |
                            ______|
                            """);

            case 1 -> System.out.println(
                    """
                               ____
                               o  |
                                  |
                                  |
                            ______|
                            """);

            case 2 -> System.out.println(
                    """
                               ____
                               o  |
                               |  |
                                  |
                            ______|
                            """);

            case 3 -> System.out.println(
                    """
                               ____
                               o  |
                              -|  |
                                  |
                            ______|
                            """);

            case 4 -> System.out.println(
                    """
                               ____
                               o  |
                              -|- |
                                  |
                            ______|
                            """);

            case 5 -> System.out.println(
                    """
                               ____
                               o  |
                              -|- |
                              /   |
                            ______|
                            """);

            case 6 -> System.out.println(
                    """
                               ____
                               o  |
                              -|- |
                              / \\ |
                            ______|
                            """);

        }
    }

}
