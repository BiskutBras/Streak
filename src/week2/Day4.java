package week2;

public class Day4 {

    public static boolean isStrongPassword(String password) {

//        It has at least 8 characters.
//        It contains at least one uppercase letter.
//        It contains at least one lowercase letter.
//        It contains at least one digit.
//        It contains at least one special character (e.g., !@#$%^&*()-_+=).

        if (password.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;


        for (char c : password.toCharArray()) {

            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if ("!@#$%^&*()-_+=".indexOf(c) != -1) hasSpecial = true;

        }

        return hasUpper && hasLower && hasDigit && hasSpecial;

    }


    public static void main(String[] args) {
        System.out.println(isStrongPassword("Hello!@"));
    }
}
