package com.mycompany.app;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static String greeting (){
        return "Moin moin";
    }

    public static int calculateLengthOfString(String someText) {
        return someText.length();
    }

    public static int add(int number, int anotherNumber){
        return number + anotherNumber;
    }
}
