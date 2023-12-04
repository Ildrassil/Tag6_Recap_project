import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidierungTest {

    @Test
    void PasswordValidierung(){
        String inputPassowrd = "Testpasswort8354!";
        String actualPassowrd = "Testpasswort8354!";
        boolean isValid = PasswordValidierung.password(inputPassowrd,actualPassowrd);
        boolean expected = true;
        assertEquals( expected, isValid);

    }

    @Test
    void PasswordVlaid(){
        String input = "Testpasswort8354!";
        char [] inputPassword = input.toCharArray();
        boolean isValid = PasswordValidierung.isPassword(inputPassword, 8, 99);
        boolean ecpected = true;

        assertEquals(ecpected,isValid);
    }

}