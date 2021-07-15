import java.util.Locale;

public class Alarm {
    public static void main(String[] args) {
        System.out.println(howManyLeft(31));
        System.out.println(alarmMeter("Gelb"));
    }
    public static String howManyLeft(int howManyIn) {
        int maxPeople = 30;
        if (howManyIn== maxPeople){
            return "Laden voll!";
        }
        boolean stillSpaceForMore = howManyIn<30;
        if (stillSpaceForMore){
            return "Maximale Personenanzahl nicht überschritten";
        } else {
            return "Zu viele Personen!";
        }
    }
    public static String alarmMeter (String level){
        switch (level.toLowerCase(Locale.ROOT)){
            case "rot":
                return "Keine Personen erlaubt!";
            case "gelb":
                return "Max 30 Personen erlaubt";
            case "grün":
                return "Max 60 Personen erlaubt";
            default:
                return "Ungültige Eingabe";
        }
    }
}
