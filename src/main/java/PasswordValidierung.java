import java.util.Scanner;

public class PasswordValidierung {

    public static boolean isPassword(char[] password, int m, int n){

        if( password.length == 0 || password.length > n || password.length < m){
            return false;
        }
        String passwordUsualCheck = password.toString();


        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean symbol = false;
        int numberCount = 0;

        for( char ch : password){
            if(Character.isUpperCase(ch)){
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

    public static boolean passwordCheck(String password, String acutualPassword){
        if (password == acutualPassword){
            return true;
        }
        return false;
    }



    public static boolean password(String actualPassword, String inputPassword){
        char[] actualPasswordCharArray = actualPassword.toCharArray();
        boolean isActualPasswordAPassword = isPassword(actualPasswordCharArray, 8,99);
        boolean passwordIsValid = false;
        if(isActualPasswordAPassword){
           passwordIsValid = passwordCheck(actualPassword, inputPassword);
        }
        return passwordIsValid;



    }
    public static void CheckPassword()
    {
        String[] commonPass =  {"1234", "testing", "dragon", "passowrd","abc","ABC","Abc","aBc","ABc","abC","aBC", "9876", "qwerty", "football","111111","1111","letmein","trustnot","princess","Iloveu","Iloveyou","iloveyou","sunshine","Sunshine","adobe123","123456789"};

        System.out.println("Requirements for the Password:");
        System.out.println("1. It must contain at least one Capital Letter.");
        System.out.println("2. It must contain at least 4 digits.");
        System.out.println("3. It must contain at least one Symbol.");
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your password.");
        String password = s.nextLine();
        char[] passwordArray = password.toCharArray();
        boolean validPassword = isPassword(passwordArray, 8, 99);
        if(validPassword == true) {
            for (int i = 0; i < commonPass.length; i++) {
                if (password.contains(commonPass[i])) {
                    System.out.println("Your Passowrd is too Weak. Please read the Requirements again.");
                    CheckPassword();
                }

            }
        }

        else{
            System.out.println("Your Passowrd is too Weak. Please read the Requirements again.");
            CheckPassword();
        }
        System.out.println("Your Password is Strong!");

    }

    public static void main(String[] args) {
        CheckPassword();
        System.out.println("was Sucessful!");
    }



}
