import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidierungTest {

    @Test
    void PasswordValidierung(){
        String inputPassowrd = "TestFische8976!";
        String actualPassowrd = "TestFische8976!";
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

    @Test
    void PasswordValidCheck_whenPasswordIsRandom_ThenTrue(){


        char [] generated = generatedString.toCharArray();
        boolean isValid = PasswordValidierung.isPassword(generated, 8,99);
        boolean expected = true;

        assertEquals(expected, isValid);
    }

}