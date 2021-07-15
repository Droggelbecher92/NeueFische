package com.mycompany.app;

public class SwitchExample {
    public static void main(String[] args) {
        int i = 4;

        switch (i){
            case 2:
                System.out.println("2");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("Anderer Wert");
        }
    }
}
