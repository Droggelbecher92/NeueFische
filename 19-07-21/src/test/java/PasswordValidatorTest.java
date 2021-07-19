import de.kittlaus.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PasswordValidatorTest {

    @Test
    public void passwordLenthShort(){
        //GIVEN
        String password = "Passwort";
        //WHEN
        boolean actual = PasswordValidator.isLongEnought(password);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    public void passwordLenthOK(){
        //GIVEN
        String password = "Passwort1213";
        //WHEN
        boolean actual = PasswordValidator.isLongEnought(password);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    public void passordContainsDigits(){
        //GIVEN
        String password = "Passwort1213";
        //WHEN
        boolean actual = PasswordValidator.containsDigits(password);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    public void passordContainsNoDigits(){
        //GIVEN
        String password = "Passwort";
        //WHEN
        boolean actual = PasswordValidator.containsDigits(password);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    public void passordAllLowercase(){
        //GIVEN
        String password = "passwort";
        //WHEN
        boolean actual = PasswordValidator.containsUpperAndLowercase(password);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    public void passordAllUppercase(){
        //GIVEN
        String password = "PASSORDSA";
        //WHEN
        boolean actual = PasswordValidator.containsUpperAndLowercase(password);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    public void passordMixedcase(){
        //GIVEN
        String password = "passwortAB";
        //WHEN
        boolean actual = PasswordValidator.containsUpperAndLowercase(password);
        //THEN
        Assertions.assertTrue(actual);
    }



    @ParameterizedTest
    @MethodSource("provideValidPassordArguments")
    public void validPassord(String password, boolean expected){
        //WHEN
        boolean actual = PasswordValidator.validate(password);
        //THEN
        assertEquals(expected,actual);
    }

    private static Arguments[] provideValidPassordArguments(){
        return new Arguments[]{
                Arguments.of("Passwort123",true),
                Arguments.of("passwort123",false),
                Arguments.of("PASSWORD123",false),
                Arguments.of("Pas23",false),
                Arguments.of("123456789",false),
                Arguments.of("!§$%$§$%&%$",false)
        };
    }

}