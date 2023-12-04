import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class PasswordValidierung {

    public static boolean isPassword(char[] password, int m, int n) {

        if (password.length == 0 || password.length > n || password.length < m) {
            return false;
        }


        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean symbol = false;
        int numberCount = 0;

        for (char ch : password) {
            if (Character.isUpperCase(ch)) {
                upper = true;

            } else if (Character.isLowerCase(ch)) {
                lower = true;

            } else if (Character.isDigit(ch)) {
                digit = true;
                numberCount++;

            } else if (!(Character.isLetter(ch)) && !(Character.isDigit(ch))) {


                symbol = true;

            }

        }
        return upper && lower && digit && symbol && numberCount >= 4;
    }


    public static String passwordGenerate() {
        StringBuilder builder = new StringBuilder();
        int randomLength = new Random().nextInt(8, 15);
        for (int i = 0; i <= randomLength; i++) {
            char a = (char) new Random().nextInt(33, 126);

            builder.append(a);


        }



        builder.setCharAt(new Random().nextInt(0, randomLength - 1), (char) new Random().nextInt(48, 57));
        builder.setCharAt(new Random().nextInt(0, randomLength - 1), (char) new Random().nextInt(48, 57));
        builder.setCharAt(new Random().nextInt(0, randomLength - 1), (char) new Random().nextInt(48, 57));
        builder.setCharAt(new Random().nextInt(0, randomLength - 1), (char) new Random().nextInt(48, 57));

        return builder.toString();
    }

    public static void CheckPassword() {
        String[] commonPass = {"1234", "testing", "dragon", "password", "Test", "test", "passwort", "abc", "ABC", "Abc", "aBc", "ABc", "abC", "aBC", "9876", "qwerty", "football", "111111", "1111", "letmein", "trustnot", "princess", "Iloveu", "Iloveyou", "iloveyou", "sunshine", "Sunshine", "adobe123", "123456789"};
        String password = "";
        out.println("Requirements for the Password:");
        out.println("1. It must contain at least one Capital Letter.");
        out.println("2. It must contain at least 4 digits.");
        out.println("3. It must contain at least one Symbol.");
        Scanner s = new Scanner(in);
        out.println("Do you want to use a generated Password: (yes/no)");
        String answer = s.nextLine();
        if ("yes".equals(answer)) {
            String genratedPassword = passwordGenerate();
            out.println("Your created Password is: ");
            out.println(genratedPassword);
            out.println("please write the Password to remember.");
            s.close();



        } else if ("no".equals(answer)) {

            Scanner e = new Scanner(in);
            out.println("Enter your password.");
            password = e.nextLine();
            e.close();

            char[] passwordArray = password.toCharArray();
            boolean validPassword = isPassword(passwordArray, 8, 99);
            if (validPassword == true) {
                for (int i = 0; i < commonPass.length; i++) {
                    if (commonPass[i].contains(password)) {
                        out.println("Your Passowrd is too Weak. Please read the Requirements again.");
                        CheckPassword();
                    }

                }
            } else {
                out.println("Your Passowrd is too Weak. Please read the Requirements again.");
                CheckPassword();
            }

        }
        out.println("Your Password is Strong!");



    }

    public static void main(String[] args) {
        CheckPassword();

        out.println("was Sucessful!");
    }
}
 /*public static boolean passwordCheck(String password, String acutualPassword){
        if (password == acutualPassword){
            return true;
        }
        return false;
    }*/


    /*public static boolean password(String actualPassword, String inputPassword) {
        char[] actualPasswordCharArray = actualPassword.toCharArray();
        boolean isActualPasswordAPassword = isPassword(actualPasswordCharArray, 8, 99);
        boolean passwordIsValid = false;
        String[] commonPass = {"1234", "testing", "dragon", "password","passwort", "abc", "ABC", "Abc", "aBc", "ABc", "abC", "aBC", "9876","Test","Testing","test", "qwerty", "football", "111111", "1111", "letmein", "trustnot", "princess", "Iloveu", "Iloveyou", "iloveyou", "sunshine", "Sunshine", "adobe123", "123456789"};

        for (int i = 0; i < commonPass.length; i++) {
            if (actualPassword.contains(commonPass[i])) {
                return false;
            }

        }
        if (isActualPasswordAPassword) {
            passwordIsValid = passwordCheck(actualPassword, inputPassword);
        }
        return passwordIsValid;

    }*/



