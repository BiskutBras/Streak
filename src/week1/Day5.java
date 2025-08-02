package week1;

public class Day5 {

    public static boolean palindromeCheck(String s) {

        if (s == null) return false;

        // clean the text and change case to lower case
        String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int leftPointer = 0;
        int rightPointer = cleaned.length() - 1;

        while (leftPointer < rightPointer) {
            if (cleaned.charAt(leftPointer) != cleaned.charAt(rightPointer)) {
                return false;
            }
            leftPointer++;
            rightPointer--;

        }
        return true;

    }

    public static void main(String[] args) {
        String word = "A man, a plan, a canal, Panama";
        boolean isPalindrome = palindromeCheck(word);
        System.out.println("Is palindrome: " + isPalindrome);

    }
}
