package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest 
{
    @Test
    public void checkGreeting()
    {
        String checkGreeting = App.greeting();
        assertTrue(checkGreeting.length()<10);
        assertTrue(checkGreeting.contains("oin"));
        assertFalse(checkGreeting.startsWith("H"));
    }

    @Test
    public void testLengthOfString(){
        // GIVEN
        String theText = "Deine Mama";
        // WHEN
        int actual = App.calculateLengthOfString(theText);
        // THEN
        assertTrue(actual<20 && actual>4);
    }

    @Test
    public void testAdd (){
        // GIVEN
        int firstValue = 3;
        int secondValue = 7;
        // WHEN
        int actual = App.add(firstValue, secondValue);
        // THEN
        assertEquals(10, actual);
    }


}
