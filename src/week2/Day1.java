package week2;


import java.util.HashMap;
import java.util.Scanner;

public class Day1 {

    public static void userLogin() {

        // valid input
        HashMap<String, String> validAccount = new HashMap<>();
        validAccount.put("BiskutBras", "biskutbras");
        validAccount.put("Syahrul", "syahrul");
        validAccount.put("Username", "username");

        // user input
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter your username here");
        String inputUsername = myScan.nextLine();

        // validate username
        if (!validAccount.containsKey(inputUsername)) {
            System.out.println("Username does not exist!");
            return;
        }

        System.out.println("Enter the password");
        String inputPassword = myScan.nextLine();

        // validate password
        if (!validAccount.get(inputUsername).equals(inputPassword)) {
            System.out.println("Password is incorrect!");
            return;
        }

        myScan.close();

        // successful login
        System.out.println();
        System.out.printf("Welcome %s", inputUsername);

    }

    public static void main(String[] args) {
        userLogin();
    }

}
