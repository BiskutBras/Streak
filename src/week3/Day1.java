package week3;

public class Day1 {

    public static boolean isAnagram(String firstWord, String secWord) {

        if (firstWord.length() != secWord.length()) return false;

        firstWord = firstWord.toLowerCase();
        secWord = secWord.toLowerCase();

        for (char c : firstWord.toCharArray()) {
            
            if (secWord.indexOf(c) == -1) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("ratel", "later"));
    }

}
