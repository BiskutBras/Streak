package week5;

public class Day6 {

    public static String removeVowels(String sentence) {

        StringBuilder noVowels = new StringBuilder();


        for (char c : sentence.toCharArray()) {

            if ("aeiou".indexOf(c) != -1) {


                noVowels.replace(sentence.indexOf(c), (sentence.indexOf(c) + 1), "");

            } else {
                noVowels.append(c);
            }
        }

        return noVowels.toString();
    }

    public static void main(String[] args) {

//        System.out.println("abc".replaceAll("[aeiou]", ""));
        System.out.println(removeVowels("Java Programming"));

//        StringBuilder test = new StringBuilder("syahrul");
//        System.out.println(test.toString().charAt(0));
//        System.out.println(test.toString().charAt(3));
//        test.replace(0, 3, "now");
//        System.out.println(test.toString());
    }
}
