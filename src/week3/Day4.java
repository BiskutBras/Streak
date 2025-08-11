package week3;

@SuppressWarnings("SameParameterValue")
public class Day4 {

    private static String intToRoman(int n) {

        if (n <= 0) return "negative value or 0 is not valid";
        if (n > 4000) return "roman numerals range from 1 - 3999 only";

        int[] key = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < key.length; i++) {

            while (n >= key[i]) {
                n -= key[i];
                sb.append(roman[i]);
            }
        }


        return sb.toString();
    }


    public static void main(String[] args) {

        // 676 - 500 -> D
        // 176 - 100 -> C
        // 76 - 50 -> L
        // 26 - 10 -> X
        // 16 - 10 -> X
        // 6 - 5 -> V
        // 1 - 1 -> I

        System.out.println(intToRoman(-5));
    }

}
