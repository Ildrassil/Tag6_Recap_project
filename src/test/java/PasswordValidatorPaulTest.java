import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorPaulTest {
    @Test
    public void securePasswordGeneratorTest_returnValuePassesisPasswordSecure() {
        // GIVEN
        String securePassword = PasswordValidatorPaul.securePasswordGenerator();

        // WHEN
        boolean actual = PasswordValidatorPaul.isPasswordSecure(securePassword);

        // THEN
        assertTrue(actual);
    }

    @Test
    public void isPasswordSecureTest_whensRHvW4CFFcgTYfnB6CH95DollarSign_thenTrue() {
        // GIVEN
        String a = "sRHvW4CFFcgTYfnB6CH95$";

        // WHEN
        boolean actual = PasswordValidatorPaul.isPasswordSecure(a);

        // THEN
        assertTrue(actual);
    }

    @Test
    public void isPasswordSecureTest_whensRHvW4CFFcgTYfnB6CH95_thenFalse() {
        // GIVEN
        String a = "sRHvW4CFFcgTYfnB6CH95";

        // WHEN
        boolean actual = PasswordValidatorPaul.isPasswordSecure(a);

        // THEN
        assertFalse(actual);
    }

    @Test
    public void isPasswordSecureTest_whenBQe8qpP_thenFalse() {
        // GIVEN
        String a = "BQe8qpP";

        // WHEN
        boolean actual = PasswordValidatorPaul.isPasswordSecure(a);

        // THEN
        assertFalse(actual);
    }

    @Test
    public void isPasswordSecureTest_wheniznagmfsinkirj_thenFalse() {
        // GIVEN
        String a = "iznagmfsinkirj";

        // WHEN
        boolean actual = PasswordValidatorPaul.isPasswordSecure(a);

        // THEN
        assertFalse(actual);
    }

    @Test
    public void isPasswordSecureTest_when46367694925844_thenFalse() {
        // GIVEN
        String a = "46367694925844";

        // WHEN
        boolean actual = PasswordValidatorPaul.isPasswordSecure(a);

        // THEN
        assertFalse(actual);
    }

    @Test
    public void isPasswordSecureTest_when82vc3ts94bq5vh6u3n4eb_thenFalse() {
        // GIVEN
        String a = "82vc3ts94bq5vh6u3n4eb";

        // WHEN
        boolean actual = PasswordValidatorPaul.isPasswordSecure(a);

        // THEN
        assertFalse(actual);
    }

    @Test
    public void isPasswordSecureTest_whenPassword_thenFalse() {
        // GIVEN
        String a = "Password";

        // WHEN
        boolean actual = PasswordValidatorPaul.isPasswordSecure(a);

        // THEN
        assertFalse(actual);
    }

    @Test
    public void hasValidLengthTest_whenHallo_thenFalse() {
        // GIVEN
        String a = "Hallo";

        // WHEN
        boolean actual = PasswordValidatorPaul.hasValidLength(a);

        // THEN
        assertFalse(actual);
    }

    @Test
    public void hasValidLengthTest_whenHalloGroup2_thenTrue() {
        // GIVEN
        String a = "HalloGroup2";

        // WHEN
        boolean actual = PasswordValidatorPaul.hasValidLength(a);

        // THEN
        assertTrue(actual);
    }

    @Test
    public void hasDigitsTest_whenPassword123_thenTrue() {
        // GIVEN
        String a = "Password123";

        // WHEN
        boolean actual = PasswordValidatorPaul.hasDigits(a);

        // THEN
        assertTrue(actual);
    }

    @Test
    public void hasDigitsTest_Passwordonetwothree_thenFalse() {
        // GIVEN
        String a = "Passwordonetwothree";

        // WHEN
        boolean actual = PasswordValidatorPaul.hasDigits(a);

        // THEN
        assertFalse(actual);
    }

    @Test
    public void hasLowerCaseTest_asd1324asdg_thenTrue() {
        // GIVEN
        String a = "asd1324asdg";

        // WHEN
        boolean actual = PasswordValidatorPaul.hasLowerCase(a);

        // THEN
        assertTrue(actual);
    }
    
    @Test
    public void hasLowerCaseTest_ASFASDAA_thenFalse() {
        // GIVEN
        String a = "ASFASDAA";

        // WHEN
        boolean actual = PasswordValidatorPaul.hasLowerCase(a);

        // THEN
        assertFalse(actual);
    }    
    
    @Test
    public void hasLowerCaseTest_ASsasfAS_thenTrue() {
        // GIVEN
        String a = "ASsasfAS";

        // WHEN
        boolean actual = PasswordValidatorPaul.hasLowerCase(a);

        // THEN
        assertTrue(actual);
    }

    @Test
    public void hasLowerCaseTest_ü_thenTrue() {
        // GIVEN
        String a = "ü";

        // WHEN
        boolean actual = PasswordValidatorPaul.hasLowerCase(a);

        // THEN
        assertTrue(actual);
    }

    @Test
    public void hasUpperCaseTest_asd1324asdg_thenFalse() {
        // GIVEN
        String a = "asd1324asdg";

        // WHEN
        boolean actual = PasswordValidatorPaul.hasUpperCase(a);

        // THEN
        assertFalse(actual);
    }

    @Test
    public void hasUpperCaseTest_ASFASDAA_thenTrue() {
        // GIVEN
        String a = "ASFASDAA";

        // WHEN
        boolean actual = PasswordValidatorPaul.hasUpperCase(a);

        // THEN
        assertTrue(actual);
    }

    @Test
    public void hasUpperCaseTest_ASsasfAS_thenTrue() {
        // GIVEN
        String a = "ASsasfAS";

        // WHEN
        boolean actual = PasswordValidatorPaul.hasUpperCase(a);

        // THEN
        assertTrue(actual);
    }

    @Test
    public void hasUpperCaseTest_asfsasfÜ_thenTrue() {
        // GIVEN
        String a = "asfsasfÜ";

        // WHEN
        boolean actual = PasswordValidatorPaul.hasUpperCase(a);

        // THEN
        assertTrue(actual);
    }

    @Test public void isPasswordBadTest_whenadmin123_thenTrue() {
        // GIVEN
        String a = "admin123";

        // WHEN
        boolean actual = PasswordValidatorPaul.isPasswordBad(a);

        // THEN
        assertTrue(actual);
    }

    @Test public void isPasswordBadTest_whenliverpool_thenTrue() {
        // GIVEN
        String a = "liverpool";

        // WHEN
        boolean actual = PasswordValidatorPaul.isPasswordBad(a);

        // THEN
        assertTrue(actual);
    }

    @Test public void isPasswordBadTest_whenLiverpool_thenFalse() {
        // GIVEN
        String a = "Liverpool";

        // WHEN
        boolean actual = PasswordValidatorPaul.isPasswordBad(a);

        // THEN
        assertFalse(actual);
    }

    @Test public void hasSpecialCharsTest_whenStringWithSpecialChars_thenTrue() {
        // GIVEN
        String a = "*@cK#%Kdf5H";

        // WHEN
        boolean actual = PasswordValidatorPaul.hasSpecialChars(a);

        // THEN
        assertTrue(actual);
    }
    @Test public void hasSpecialCharsTest_whenAsf12312_thenFalse() {
        // GIVEN
        String a = "Asf12312";

        // WHEN
        boolean actual = PasswordValidatorPaul.hasSpecialChars(a);

        // THEN
        assertFalse(actual);
    }
}