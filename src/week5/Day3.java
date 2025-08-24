package week5;

public class Day3 {

    public static String fizzBuzz() {

        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i <= 50) {

            if (i % 3 == 0 && i % 5 == 0) {
                sb.append("fizzbuzz\n");
            } else if (i % 3 == 0) {
                sb.append("fizz\n");
            } else if (i % 5 == 0) {
                sb.append("buzz\n");
            } else {
                sb.append(i).append("\n");
            }


            i++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz());
    }

}
