package week3;

public class Day3 {

    public static int[] vowelsAndConsonantChecker(String s) {

        if (s == null || s.isBlank()) return new int[]{0, 0};

        s = s.toLowerCase().replaceAll("[^a-z]", "");
        System.out.println("s: " + s);

        int vowelsCount = 0;

        for (char c : s.toCharArray()) {

            if ("aeiou".indexOf(c) != -1) vowelsCount++;

        }

        return new int[]{vowelsCount, s.length() - vowelsCount};
    }

    public static void main(String[] args) {
        for (int result : vowelsAndConsonantChecker("  332ewr")) {
            System.out.println(result);
        }
    }

}
