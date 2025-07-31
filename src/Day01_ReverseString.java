public class Day01_ReverseString {

    public static String reverseString(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {

            sb.append(str.charAt(i));

        }
        return sb.toString();
    }

    public static String reverseStringSimpler(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {

        String input = "54321";

        String output = reverseStringSimpler(input);

        System.out.println(output);

    }
}
