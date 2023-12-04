public class PasswordValidierung {

    public boolean isPassword(char[] password, int m, int n){

        if( password.length == 0 || password.length < n || password.length > m){
            return false;
        }

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
                
            } else if (!(Character.isLetter(ch))) {
                if (!(Character.isDigit(ch))) {


                    symbol = true;
                }
            }
            return upper && lower && digit && symbol && numberCount >= 4;
        }

    }
}
