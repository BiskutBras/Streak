package week2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day1 {

    public static void userLogin() {

        // valid input
        Set<String> validUserList = new HashSet<>();
        validUserList.add("BiskutBras");
        validUserList.add("Syahrul");
        validUserList.add("Username");
        String validPassword = "bukalahi01";

        // boolean logic
        boolean isUsernameValid = false;
        boolean isPasswordValid = false;

        // user input
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter your username here");
        String inputUsername = myScan.nextLine();

        System.out.println("Enter the password");
        String inputPassword = myScan.nextLine();

        myScan.close();

        // validate input
        if (validUserList.contains(inputUsername)) {
            isUsernameValid = true;
        }
        if (validPassword.equals(inputPassword)) {
            isPasswordValid = true;
        }

        // print message
        if (isUsernameValid && isPasswordValid) {
            System.out.printf("Welcome %s", inputUsername);
        } else {
            System.out.println("Invalid credentials, please try again");
        }

    }

    public static void main(String[] args) {
        userLogin();
    }

}
