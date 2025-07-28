public class Day01_ReverseString {

    public static String reverseString(String str) {


        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {

            sb.append(str.charAt(i));

        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String reversedString = reverseString("54321");
        System.out.println(reversedString);

    }
}
