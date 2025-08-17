package week4;

public class Day3 {

    public static int wordSearch(String sentence, String word) {

        String cleaned = sentence.replaceAll("[^A-Za-z0-9\\s]", "");

        System.out.println(cleaned);

        int wordCount = 0;

        for (String s : cleaned.split(" ")) {

            if (s.equals(word)) {
                wordCount++;
            }

        }

        return wordCount;


    }

    public static void main(String[] args) {
        System.out.println(wordSearch("testl test maybe test", "test"));
    }

}
