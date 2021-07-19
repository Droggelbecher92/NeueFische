public class PasswordValidator {

    private static final int MIN_LENGTH = 8;

    public static boolean isLongEnought(String password) {
        return password.length() > MIN_LENGTH;
    }

    public static boolean containsDigits(String password) {
        for (int i = 0;i<password.length();i++){
            char symbol = password.charAt(i);
            if (Character.isDigit(symbol)){
                return true;
            }
        }
        return false;
    }

    public static boolean containsUpperAndLowercase(String password) {
        String lowercase = password.toLowerCase();
        boolean isAllLowercase = lowercase.equals(password);
        String uppercase = password.toUpperCase();
        boolean isAllUppercase = uppercase.equals(password);
        boolean hasLowerAndUppercase = !isAllUppercase && !isAllLowercase;
        return hasLowerAndUppercase;
    }

    public static boolean validate(String password) {
        return isLongEnought(password)&&containsDigits(password)&&containsUpperAndLowercase(password);
    }
}
