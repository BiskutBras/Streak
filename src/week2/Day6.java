package week2;

public class Day6 {

    public static String longestPalindrome(String s) {

        int left = 0, right = 0;

        if (s.length() % 2 != 0) {
            left = s.length() / 2;
            right = s.length() / 2;
        } else {

            right = s.length() / 2;
            left = right - 1;
        }

        while (left >= 0 && right < s.length()) {

            if (s.charAt(left) == s.charAt(right)) {

                left--;
                right++;
            } else {
                left++;
                right--;
                return s.substring(left, right + 1);

            }


        }
        return null;

    }

    public static void main(String[] args) {

        System.out.println(longestPalindrome("422raarrer"));

    }

}
