public class Beispiele {
    public static void main(String[] args) {
        darfIchFahren(true);
        navigationsAnsage("rechts");
        wuerfelRollenLassen(2);
        bierTrinken(7);
        String[] alleMeineSchuhe = new String[8];
        alleMeineSchuhe[1] = "Chucks schwarz";
        System.out.println(alleMeineSchuhe[0]);
        System.out.println(alleMeineSchuhe[1]);
        int[] dieErstenDreiZahlen = {1,2,3};
        System.out.println(dieErstenDreiZahlen[0]);
        System.out.println(dieErstenDreiZahlen[2]);
    }

    public static String darfIchFahren(boolean ampelAufGrün){
        if (ampelAufGrün){
            return "Fahr weiter";
        } else {
            return "Bitte warten";
        }
    }

    public static String navigationsAnsage (String inWelcheRichtung){
        switch (inWelcheRichtung){
            case "rechts":
                return "Bitte rechts abbiegen";
            case "links":
                return "Bitte links abbiegen";
            case "gerade":
                return "Bis auf weitere Anweiungen der Straße folgen";
            default:
                return "Ich habe keine Ahnung wo wir sind";
        }
    }

    public static void wuerfelRollenLassen (int wuerfelErgebnis){
        switch (wuerfelErgebnis){
            case 1:
                System.out.println("du hast eine Eins gewürfelt!");
                break;
            case 2:
                System.out.println("Du hast eine Zwei gewürfelt!");
                break;
            default:
                System.out.println("du hast etwas zwischen 3-6 gewürfelt!");
        }
    }

    public static void bierTrinken (int wieVielBier){
        for (int i =0;i <=wieVielBier;i++){
            System.out.println("Hoch das Glas!");
        }
        System.out.println("Bier leider leer.... da muss ein neues her!");
    }



}
