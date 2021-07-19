import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {
    @Test

    public void checkWith29People() {
        //GIVEN
        int peopleTest = 29;
        //WHEN
        String actual = Alarm.howManyLeft(peopleTest);
        //THEN
        Assertions.assertEquals("Maximale Personenanzahl nicht überschritten", actual);
    }

    @Test

    public void checkWith30People() {
        //GIVEN
        int peopleTest = 30;
        //WHEN
        String actual = Alarm.howManyLeft(peopleTest);
        //THEN
        Assertions.assertEquals("Laden voll!", actual);
    }

    @Test

    public void checkWith31People() {
        //GIVEN
        int peopleTest = 31;
        //WHEN
        String actual = Alarm.howManyLeft(peopleTest);
        //THEN
        Assertions.assertEquals("Zu viele Personen!", actual);
    }

    @Test
    public void alarmTestWithRed() {
        //GIVEN
        String test = "rot";
        //WHEN
        String actual = Alarm.alarmMeter(test);
        //THEN
        Assertions.assertEquals("Keine Personen erlaubt!", actual);
    }

    @Test
    public void alarmTestWithYellow() {
        //GIVEN
        String test = "gelb";
        //WHEN
        String actual = Alarm.alarmMeter(test);
        //THEN
        Assertions.assertEquals("Max 30 Personen erlaubt", actual);
    }

    @Test
    public void alarmTestWithGreen() {
        //GIVEN
        String test = "grün";
        //WHEN
        String actual = Alarm.alarmMeter(test);
        //THEN
        Assertions.assertEquals("Max 60 Personen erlaubt", actual);

    }

    @Test
    public void alarmTestWrongInput() {
        //GIVEN
        String test = "bla";
        //WHEN
        String actual = Alarm.alarmMeter(test);
        //THEN
        Assertions.assertEquals("Ungültige Eingabe", actual);
    }
}