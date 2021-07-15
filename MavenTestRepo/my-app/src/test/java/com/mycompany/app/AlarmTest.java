package com.mycompany.app;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class AlarmTest {

    @Test
    public void checkPersons(){
        //GIVEN
        int persons = 40;
        int otherPersons = 30;
        //WHEN
        String actual = Alarm.personChecker(persons);
        String otherActual = Alarm.personChecker((otherPersons));
        //THEN
        Assert.assertEquals("Zu viel Personen, zurück!",actual);
        Assert.assertEquals("Laden voll",otherActual);
    }

    @Test
    public void checkColor(){
        //GIVEN
        int persons = 29;
        //WHEN

        //THEN

    }


}