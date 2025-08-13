package week3;

import java.util.HashMap;

public class Day6 {

    public static void wordCounter(String sentence) {

        String cleaned = sentence.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

        String[] words = cleaned.split("\\s+");
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {

            int currentCount = wordCount.getOrDefault(word, 0);
            wordCount.put(word, currentCount + 1);

        }

        System.out.println(wordCount);

    }

    public static void main(String[] args) {

        wordCounter("Hello, hello world! Hello world.");

    }

}
