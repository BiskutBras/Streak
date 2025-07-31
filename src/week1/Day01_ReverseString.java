package week1;

public class Day01_ReverseString {

    public static String reverseStringSimpler(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {

        String input = "54321";

        String output = reverseStringSimpler(input);

        System.out.println(output);

    }
}
