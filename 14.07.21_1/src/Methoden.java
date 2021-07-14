public class Methoden {

    public static void main(String[] args) {
        System.out.println(duplicate(5));
        System.out.println(add(4, 6));
        System.out.println(sub(5, 2));
        System.out.println(div(15, 3));
    }

    public static int duplicate(int value) {
        return value * 2;
    }

    public static int add(int fistValue, int secondValue) {
        return fistValue + secondValue;
    }

    public static int sub(int fistValue, int secondValue) {
        return fistValue - secondValue;
    }

    public static int div(int fistValue, int secondValue) {
        return fistValue / secondValue;
    }

}
