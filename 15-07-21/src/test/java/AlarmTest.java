import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {
    @Test

    public void checkHowManyPeopleLeft() {
        //GIVEN
        int peopleTest1 = 29;
        int peopleTest2 = 30;
        int peopleTest3 = 31;
        //WHEN
        String actual1 = Alarm.howManyLeft(peopleTest1);
        String actual2 = Alarm.howManyLeft(peopleTest2);
        String actual3 = Alarm.howManyLeft(peopleTest3);
        //THEN
        Assertions.assertEquals("Maximale Personenanzahl nicht überschritten", actual1);
        Assertions.assertEquals("Laden voll!", actual2);
        Assertions.assertEquals("Zu viele Personen!", actual3);
    }

    @Test
    public void alarmTest() {
        //GIVEN
        String test1 = "rot";
        String test2 = "gelb";
        String test3 = "grün";
        String test4 = "bla";
        //WHEN
        String actual1 = Alarm.alarmMeter(test1);
        String actual2 = Alarm.alarmMeter(test2);
        String actual3 = Alarm.alarmMeter(test3);
        String actual4 = Alarm.alarmMeter(test4);
        //THEN
        Assertions.assertEquals("Keine Personen erlaubt!", actual1);
        Assertions.assertEquals("Max 30 Personen erlaubt", actual2);
        Assertions.assertEquals("Max 60 Personen erlaubt", actual3);
        Assertions.assertEquals("Ungültige Eingabe", actual4);

    }
}