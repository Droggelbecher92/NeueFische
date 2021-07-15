package com.mycompany.app;

public class Alarm {


    public static String personChecker(int persons) {
        int maxPersons = 30;
        if (persons==maxPersons){
            return "Laden voll";
        }
        boolean morePeopleAllowed = persons <= maxPersons;
        if (morePeopleAllowed){
            return "Maximale Personenzahl nicht überschritten";
        } else {
            return "Zu viel Personen, zurück!";
        }

    }

    public static void levelChecker(int howMany){
        return;
    }
}
