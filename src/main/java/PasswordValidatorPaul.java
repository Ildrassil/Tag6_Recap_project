import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidatorPaul {
    public static void main(String[] args) {
        boolean result = isPasswordSecure("ASfsÜasf123$");
        System.out.println(result);

        System.out.println(securePasswordGenerator());
    }

    public static String securePasswordGenerator() {
        String securePassword = "";
        Random rand = new Random();
        int randomLength = rand.nextInt(13);

        int passwordLength = 8 + randomLength;
        for (int i = 0; i < passwordLength; i++) {
            securePassword += nextChar(securePassword, passwordLength - i);
        }

        System.out.println(securePassword);

        return securePassword;
    }

    private static char nextChar(String passwordFragment, int remaining) {
        Random rand = new Random();
        char digitChar = (char)(rand.nextInt(10) + 48);
        char specialChar = generateRandomSpecialChar();
        char upperCaseChar = (char)(rand.nextInt(26) + 65);
        char lowerCaseChar = (char)(rand.nextInt(26) + 97);

        if(remaining > 5) {
            if(!hasDigits(passwordFragment)) {
                return digitChar;
            }

            if(!hasSpecialChars(passwordFragment)) {
                return specialChar;
            }

            if(!hasUpperCase(passwordFragment)) {
                return upperCaseChar;
            }

            if(!hasLowerCase(passwordFragment)) {
                return lowerCaseChar;
            }
        }

       return switch (rand.nextInt(4)) {
            case 0 -> digitChar;
            case 1 -> specialChar;
            case 2 -> upperCaseChar;
            default -> lowerCaseChar;
        };
    }

    private static char generateRandomSpecialChar() {
        Random rand = new Random();
        char firstOption = (char) (rand.nextInt(15) + 33);
        char secondOption = (char) (rand.nextInt(7) + 58);

        return rand.nextInt() % 2 == 0 ? firstOption : secondOption;
    }

    public static boolean isPasswordSecure(String password) {
        if (isPasswordBad(password)) {
            return false;
        }

        if (!hasValidLength((password))) {
            return false;
        }

        if (!hasDigits((password))) {
            return false;
        }

        if (!hasUpperCase(password)) {
            return false;
        }

        if (!hasLowerCase(password)) {
            return false;
        }

        if(!hasSpecialChars(password)) {
            return false;
        }

        return true;
    }

    public static boolean hasValidLength(String password) {
        return password.length() > 7;
    }

    public static boolean hasDigits(String password) {
        Pattern numberPattern = Pattern.compile("\\d");
        Matcher numberMatcher = numberPattern.matcher(password);

        return numberMatcher.find();
    }

    public static boolean hasUpperCase(String password) {
        Pattern upperCasePattern = Pattern.compile("[\\p{Lu}]");
        Matcher upperCaseMatcher = upperCasePattern.matcher(password);

        return upperCaseMatcher.find();
    }

    public static boolean hasLowerCase(String password) {
        Pattern lowerCasePattern = Pattern.compile("[\\p{Ll}]");
        Matcher lowerCaseMatcher = lowerCasePattern.matcher(password);

        return lowerCaseMatcher.find();
    }

    public static boolean hasSpecialChars(String password) {
        Pattern specialCharPattern = Pattern.compile("[^\\p{Ll}\\p{Lu}\\d]");
        Matcher specialCharMatcher = specialCharPattern.matcher(password);

        return specialCharMatcher.find();
    }

    public static boolean isPasswordBad(String password) {
        String[] badPasswords = new String[]{
                "123456",
                "password",
                "123456789",
                "12345678",
                "12345",
                "111111",
                "1234567",
                "sunshine",
                "qwerty",
                "iloveyou",
                "princess",
                "admin",
                "welcome",
                "666666",
                "abc123",
                "football",
                "123123",
                "monkey",
                "654321",
                "!@#$%^&*",
                "charlie",
                "aa123456",
                "donald",
                "password1",
                "qwerty123",
                "letmein",
                "zxcvbnm",
                "login",
                "starwars",
                "121212",
                "bailey",
                "freedom",
                "shadow",
                "passw0rd",
                "master",
                "baseball",
                "buster",
                "Daniel",
                "Hannah",
                "Thomas",
                "summer",
                "George",
                "Harley",
                "222222",
                "Jessica",
                "ginger",
                "abcdef",
                "Jordan",
                "55555",
                "Tigger",
                "Joshua",
                "Pepper",
                "Robert",
                "Matthew",
                "12341234",
                "Andrew",
                "lakers",
                "andrea",
                "1qaz2wsx",
                "starwars",
                "sophie",
                "Ferrari",
                "Cheese",
                "Computer",
                "jesus",
                "Corvette",
                "Mercedes",
                "flower",
                "Blahblah",
                "Maverick",
                "Hello",
                "loveme",
                "nicole",
                "hunter",
                "amanda",
                "jennifer",
                "banana",
                "chelsea",
                "ranger",
                "trustno1",
                "merlin",
                "cookie",
                "ashley",
                "bandit",
                "killer",
                "aaaaaa",
                "1q2w3e",
                "zaq1zaq1",
                "mustang",
                "test",
                "hockey",
                "dallas",
                "whatever",
                "admin123",
                "michael",
                "liverpool",
                "querty",
                "william",
                "soccer",
                "london",
                };

//        return Arrays.stream(badPasswords).anyMatch(s -> s.equals(password));
//        return Arrays.stream(badPasswords).anyMatch(password::equals);
        return Arrays.asList(badPasswords).contains(password);
    }
}
