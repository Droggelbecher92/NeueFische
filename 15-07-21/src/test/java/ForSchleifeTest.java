import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForSchleifeTest {


    @Test
    public void testFacultryBy0(){
        //GIVEN
        int givenFacultry = 0;
        //WHEN
        int actual = ForSchleife.facultryMath(givenFacultry);
        //THEN
        Assertions.assertEquals(1,actual);
    }
    @Test
    public void testFacultryBy1(){
        //GIVEN
        int givenFacultry = 1;
        //WHEN
        int actual = ForSchleife.facultryMath(givenFacultry);
        //THEN
        Assertions.assertEquals(1,actual);
    }
    @Test
    public void testFacultryBy2(){
        //GIVEN
        int givenFacultry = 2;
        //WHEN
        int actual = ForSchleife.facultryMath(givenFacultry);
        //THEN
        Assertions.assertEquals(2,actual);
    }
    @Test
    public void testFacultryBy3(){
        //GIVEN
        int givenFacultry = 3;
        //WHEN
        int actual = ForSchleife.facultryMath(givenFacultry);
        //THEN
        Assertions.assertEquals(6,actual);
    }
    @Test
    public void testFacultryBy12(){
        //GIVEN
        int givenFacultry = 12;
        //WHEN
        int actual = ForSchleife.facultryMath(givenFacultry);
        //THEN
        Assertions.assertEquals(479001600,actual);
    }
}