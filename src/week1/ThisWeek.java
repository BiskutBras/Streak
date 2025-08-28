package week1;

public class ThisWeek {
    public static void main(String[] args) {

        Day1.reverseStringSimpler("Test");
        System.out.println("Day1.reverseStringSimpler(\"Test\") = " + Day1.reverseStringSimpler("Test"));
        System.out.println();

        Day2.Person person = new Day2.Person("Syahrul", 21);
        System.out.println("Day2.Person(\"Syahrul\", 21) = " + new Day2.Person("Syahrul", 21));
        System.out.println();

        System.out.println("Day3.filterEvenNumbers(new int[] {5,2,1,6,2,7,9}) = " + Day3.filterEvenNumbers(new int[]{5, 2, 1, 6, 2, 7, 9}));
        System.out.println();

        System.out.println("Day4.celsiusToFahrenheit(37.5) = " + Day4.celsiusToFahrenheit(37.5));
        System.out.println("Day4.celsiusToKelvin(37.5) = " + Day4.celsiusToKelvin(37.5));
        System.out.println("Day4.fahrenheitToCelsius(120.0) = " + String.format("%.2f", Day4.fahrenheitToCelsius(120.0)));
        System.out.println();

        System.out.println("Day5.palindromeCheck(\"palindrome\") = " + Day5.palindromeCheck("palindrome"));
        System.out.println("Day5.palindromeCheck(\"kayak\") = " + Day5.palindromeCheck("kayak"));
        System.out.println();

        System.out.println("Day6.reverseWords(\"one two three four five\") = " + Day6.reverseWords("one two three four five"));
        System.out.println();


    }
}
