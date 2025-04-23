package org.chypakk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ChooseWord {
    public static String get() {
        List<String> dictionary = new ArrayList<>();
        Random random = new Random();

        try {
            for (String line : Files.readAllLines(Paths.get("src/main/resources/dictionary.txt"))) {
                dictionary.addAll(Arrays.stream(line.split(" ")).toList());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return dictionary.get(random.nextInt(0, dictionary.size()));
    }
}
