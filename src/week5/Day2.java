package week5;

public class Day2 {

    public static int countDigits(int integer) {

        int digitC = 0;

        while (integer >= 10) {
            digitC++;
            integer = integer / 10;
        }

        return digitC + 1;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(100));
    }

}
